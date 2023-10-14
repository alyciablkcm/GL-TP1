package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

 @Test
 @DisplayName("Test de la méthode toString avec format correct")
 void testToStringMethodWithCorrectFormat() {
 Item element = new Item("foo", 0, 0);
 assertEquals(element.toString() , "foo, 0, 0");
 }

@Test
@DisplayName("Test 1 : Mise à jour de la qualité d'un produit régulier lorsque sellIn est de 1")
void testUpdateQualityOfRegularProductWhenSellInIs1() {
Item element = new Item("foo", 1, 0);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 0);
}
@Test
@DisplayName("Test 2 : Mise à jour de la qualité d'un produit régulier lorsque sellIn est de 0")
void testUpdateQualityOfRegularProductWhenSellInIs0() {
Item element = new Item("foo", 0, 0);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 3 : Mise à jour de la qualité d'un produit régulier lorsque sellIn est de 0 et qualité est de 1")
void testUpdateQualityOfRegularProductWhenSellInIs0AndQualityIs1() {
Item element = new Item("foo", 0, 1);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 4 : Mise à jour de la qualité d'un produit régulier lorsque sellIn est de 1 et qualité est de 1")
void testUpdateQualityOfRegularProductWhenSellInIs1AndQualityIs1() {
Item element = new Item("foo", 1, 1);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 5 : Mise à jour de la qualité d'un produit régulier lorsque sellIn est de 0 et qualité est de 2")
void testUpdateQualityOfRegularProductWhenSellInIs0AndQualityIs2() {
Item element = new Item("foo", 0, 2);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 6 : Mise à jour de la qualité d'Aged Brie lorsque sellIn est de 1 et qualité est de 50")
void testUpdateQualityOfAgedBrieWhenSellInIs1AndQualityIs50() {
Item element = new Item("Aged Brie", 1, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 50);
}

@Test
@DisplayName("Test 7 : Mise à jour de la qualité d'Aged Brie lorsque sellIn est de 1 et qualité est de 40")
void testUpdateQualityOfAgedBrieWhenSellInIs1AndQualityIs40() {
Item element = new Item("Aged Brie", 1, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 41);
}

@Test
@DisplayName("Test 8 : Mise à jour de la qualité d'Aged Brie lorsque sellIn est de 0 et qualité est de 50")
void testUpdateQualityOfAgedBrieWhenSellInIs0AndQualityIs50() {
Item element = new Item("Aged Brie", 0, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 50);
}

@Test
@DisplayName("Test 9 : Mise à jour de la qualité d'Aged Brie lorsque sellIn est de 0 et qualité est de 40")
void testUpdateQualityOfAgedBrieWhenSellInIs0AndQualityIs40() {
Item element = new Item("Aged Brie", 0, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 42);
}

@Test
@DisplayName("Test 10 : Mise à jour de la qualité d'Aged Brie lorsque sellIn est de 0 et qualité est de 49")
void testUpdateQualityOfAgedBrieWhenSellInIs0AndQualityIs49() {
Item element = new Item("Aged Brie", 0, 49);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 50);
}

@Test
@DisplayName("Test 11 : Mise à jour de la qualité des billets de concert Backstage lorsque sellIn est de 0 et qualité est de 50")
void testUpdateQualityOfBackstagePassesWhenSellInIs0AndQualityIs50() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}
@Test
@DisplayName("Test 12 : Mise à jour de la qualité des billets de concert Backstage lorsque sellIn est de 0 et qualité est de 40")
void  testUpdateQualityOfBackstagePassesWhenSellInIs0AndQualityIs40() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 13 : Mise à jour de la qualité des billets de concert Backstage lorsque sellIn est de 1 et qualité est de 50")
void testUpdateQualityOfBackstagePassesWhenSellInIs1AndQualityIs50(){
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 50);
}

@Test
@DisplayName("Test 14 : Mise à jour de la qualité des billets de concert Backstage lorsque sellIn est de 1 et qualité est de 40")
void testUpdateQualityOfBackstagePassesWhenSellInIs1AndQualityIs40() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 43);
}

@Test
@DisplayName("Test 15 : Mise à jour de la qualité des billets de concert Backstage lorsque sellIn est de 11 et qualité est de 40")
void testUpdateQualityOfBackstagePassesWhenSellInIs11AndQualityIs40() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 10);
assertEquals(element.quality, 41);
}

@Test
@DisplayName("Test 16 : Mise à jour de la qualité des billets de concert Backstage lorsque sellIn est de 6 et qualité est de 40")
void testUpdateQualityOfBackstagePassesWhenSellInIs6AndQualityIs40() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 5);
assertEquals(element.quality, 42);
}

@Test
@DisplayName("Test 17 : Mise à jour de la qualité des billets de concert Backstage lorsque sellIn est de 0 et qualité est de 49")
void testUpdateQualityOfBackstagePassesWhenSellInIs0AndQualityIs49() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 18 : Mise à jour de la qualité des billets de concert Backstage lorsque sellIn est de 1 et qualité est de 49")
void testUpdateQualityOfBackstagePassesWhenSellInIs1AndQualityIs49() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 49);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 50);
}

@Test
@DisplayName("Test 19 : Mise à jour de la qualité de l'objet légendaire Sulfuras lorsque sellIn est de 30 et qualité est de 50")
void testUpdateQualityOfLegendaryItemSulfurasWhenSellInIs30AndQualityIs50() {
Item element = new Item("Sulfuras, Hand of Ragnaros", 30, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn, 30);
assertEquals(element.quality,50);
}

@Test
@DisplayName("Test 20 : Mise à jour de la qualité de l'objet légendaire Sulfuras lorsque sellIn est de -1 et qualité est de 50")
void testUpdateQualityOfLegendaryItemSulfurasWhenSellInIsMinus1AndQualityIs50() {
Item element = new Item("Sulfuras, Hand of Ragnaros", -1, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn, -1);
assertEquals(element.quality,50);
}

@Test
public void testUpdateQualityConjuredWithPositiveSellIn() {
    Item[] items = new Item[] { new Item("Conjured", 10, 20) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertEquals(18, items[0].quality);
    assertEquals(9, items[0].sellIn);
}

@Test
public void testUpdateQualityConjuredWithNegativeSellIn() {
    Item[] items = new Item[] { new Item("Conjured", 0, 20) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertEquals(16, items[0].quality);
    assertEquals(-1, items[0].sellIn);
}

}
