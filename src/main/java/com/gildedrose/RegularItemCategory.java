package com.gildedrose;

class RegularItemCategory implements ItemCategory  {

  public void updateQuality(Item item) {
      item.quality = (item.quality > 0) ? item.quality - 1 : item.quality;
      updateSellIn(item);
      item.quality = (item.sellIn < 0 && item.quality > 0) ? item.quality - 1 : item.quality;
}

}
