package com.gildedrose;

public class BackstagePassCategory implements ItemCategory {

    public void updateQuality(Item item) {
      if (item.quality < MAX_QUALITY) {
          item.quality++;
          if (item.sellIn < 11 ) increaseQuality(item);
          if (item.sellIn < 6 ) increaseQuality(item);
      }
      updateSellIn(item);
      this.updateQualityAfterSellIn(item);
    }

    private void updateQualityAfterSellIn(Item item) {
      item.quality = (item.sellIn < 0) ? 0 : item.quality;
    }
}
