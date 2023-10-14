package com.gildedrose;

class AgedBrieCategory implements ItemCategory {

    public void updateQuality(Item item) {
      increaseQuality(item);
      updateSellIn(item);

      if (item.sellIn < 0) {
         increaseQuality(item);
     }
  }
}
