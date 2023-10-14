package com.gildedrose;

class RegularItemCategory implements ItemCategory  {

    public void updateQuality(Item item) {
          if (item.quality > 0) {
                  item.quality--;
          }
          updateSellIn(item);
          if (item.sellIn < 0 && item.quality > 0 ) {
              item.quality--;
          }
      }
}
