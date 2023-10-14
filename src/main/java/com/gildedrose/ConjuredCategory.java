package com.gildedrose;

class ConjuredCategory implements ItemCategory  {

    public void updateQuality(Item item) {
        updateSellIn(item);
        item.quality =(item.sellIn >= 0)? item.quality-2 : item.quality-4;
      }
}
