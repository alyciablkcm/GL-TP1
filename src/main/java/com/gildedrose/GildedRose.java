package com.gildedrose;

import java.util.*;
class GildedRose {
    Item[] items;
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final int MAX_QUALITY = 50;
    private Map<String, ItemCategory> categoryMap;

   public GildedRose(Item[] items) {
       this.items = items;
       this.categoryMap = new HashMap<>();
       categoryMap.put(AGED_BRIE, new AgedBrieCategory());
       categoryMap.put(BACKSTAGE_PASS, new BackstagePassCategory());
       categoryMap.put(SULFURAS, new SulfurasCategory());
   }

   public void updateQuality() {
       for (Item item : items) {
           if (categoryMap.containsKey(item.name)) {
               categoryMap.get(item.name).updateQuality(item);
           } else {
               // Catégorie par défaut pour les articles inconnus (peut être RegularItemCategory ou une autre catégorie)
               new RegularItemCategory().updateQuality(item);
           }
       }
   }
}
