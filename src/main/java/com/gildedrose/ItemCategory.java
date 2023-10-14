package com.gildedrose;

import java.util.*;

interface ItemCategory {
    public static final int MAX_QUALITY = 50;

    default void updateSellIn(Item item) {
        item.sellIn = item.sellIn - 1;;
    }

    default void increaseQuality(Item item) {
        item.quality = (item.quality < MAX_QUALITY) ? item.quality + 1 : item.quality;
    }
    
    void updateQuality(Item item);
}
