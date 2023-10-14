package com.gildedrose;

import java.util.*;

interface ItemCategory {
    public static final int MAX_QUALITY = 50;

    default void updateQualityAfterSellIn(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    default void updateSellIn(Item item) {
            item.sellIn = item.sellIn - 1;;
    }

    default void increaseQuality(Item item) {
    if (item.quality < MAX_QUALITY) {
        item.quality++;
      }
    }

    void updateQuality(Item item);
}
