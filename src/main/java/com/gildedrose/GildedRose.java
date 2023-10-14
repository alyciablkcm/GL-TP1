package com.gildedrose;

class GildedRose {
    Item[] items;
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final int MAX_QUALITY = 50;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            updateItemQuality(items[i]);
        }
    }

    private void updateItemQuality(Item item) {
        if (isRegularItem(item)) {
            updateRegularItemQuality(item);
        } else if (isAgedBrie(item)) {
            updateAgedBrieQuality(item);
        } else if (isBackstagePass(item)) {
            updateBackstagePassQuality(item);
        }
    }

    private boolean isRegularItem(Item item) {
        return !isAgedBrie(item) && !isBackstagePass(item) && !isSulfuras(item);
    }

    private boolean isAgedBrie(Item item) {
        return AGED_BRIE.equals(item.name);
    }

    private boolean isBackstagePass(Item item) {
        return BACKSTAGE_PASS.equals(item.name);
    }

    private boolean isSulfuras(Item item) {
        return SULFURAS.equals(item.name);
    }

    private void updateRegularItemQuality(Item item) {
        if (item.quality > 0) {
                item.quality--;
        }
        updateSellIn(item);
        if (item.sellIn < 0 && item.quality > 0 ) {
            item.quality--;
        }
    }

    private void updateAgedBrieQuality(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
        }
        updateSellIn(item);

        if (item.sellIn < 0) {
           if (item.quality < MAX_QUALITY) {
             item.quality++;
         }
       }
    }

    private void updateBackstagePassQuality(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
            if (item.sellIn < 11 && item.quality < MAX_QUALITY) {
                item.quality++;
            }
            if (item.sellIn < 6 && item.quality < MAX_QUALITY) {
                item.quality++;
            }
        }
        updateSellIn(item);
        updateQualityAfterSellIn(item);
    }

    private void updateQualityAfterSellIn(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private void updateSellIn(Item item) {
        if (!isSulfuras(item)) {
            item.sellIn = item.sellIn - 1;;
        }
    }
}
