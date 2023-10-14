package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

 @Test
 @DisplayName("Test toString method should format correctly")
 void testtoString() {
 Item element = new Item("foo", 0, 0);
 assertEquals(element.toString() , "foo, 0, 0");
 }

@Test
@DisplayName("Test 1")
void test1() {
Item element = new Item("foo", 1, 0);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 0);
}
@Test
@DisplayName("Test 2")
void test2() {
Item element = new Item("foo", 0, 0);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 3")
void test3() {
Item element = new Item("foo", 0, 1);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 4")
void test4() {
Item element = new Item("foo", 1, 1);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 5")
void test5() {
Item element = new Item("foo", 0, 2);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 6")
void test6() {
Item element = new Item("Aged Brie", 1, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 50);
}
@Test
@DisplayName("Test 7")
void test7() {
Item element = new Item("Aged Brie", 1, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 41);
}

@Test
@DisplayName("Test 8")
void test8() {
Item element = new Item("Aged Brie", 0, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 50);
}

@Test
@DisplayName("Test 9")
void test9() {
Item element = new Item("Aged Brie", 0, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 42);
}

@Test
@DisplayName("Test 10")
void test10() {
Item element = new Item("Aged Brie", 0, 49);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 50);
}

@Test
@DisplayName("Test 11")
void test11() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}
@Test
@DisplayName("Test 12")
void test12() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 13")
void test13() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 50);
}

@Test
@DisplayName("Test 14")
void test14() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 43);
}

@Test
@DisplayName("Test 15")
void test15() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 10);
assertEquals(element.quality, 41);
}

@Test
@DisplayName("Test 16")
void test16() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 40);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 5);
assertEquals(element.quality, 42);
}

@Test
@DisplayName("Test 17")
void test17() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , -1);
assertEquals(element.quality, 0);
}

@Test
@DisplayName("Test 18")
void test18() {
Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 49);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn , 0);
assertEquals(element.quality, 50);
}

@Test
@DisplayName("Test 19")
void test19() {
Item element = new Item("Sulfuras, Hand of Ragnaros", 30, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn, 30);
assertEquals(element.quality,50);
}

@Test
@DisplayName("Test 20")
void test20() {
Item element = new Item("Sulfuras, Hand of Ragnaros", -1, 50);
GildedRose app = new GildedRose(new Item[] {element});
app.updateQuality();
assertEquals(element.sellIn, -1);
assertEquals(element.quality,50);
}

}
