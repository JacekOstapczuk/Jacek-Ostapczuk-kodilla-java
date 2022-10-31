package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {
    public static Map <Item, Integer> itemStock() {
         Map <Item, Integer>  itemStock = new HashMap<>();
        itemStock.put(ItemGlossary.wIEDZMIN_3_WERSJA_PUDELKOW, 15);
        itemStock.put(ItemGlossary.kAPCIE_ZIEOLE, 10);
        itemStock.put(ItemGlossary.sZCZOTECZKA_SONICZNA, 2);
        return itemStock;
    }

    public void supply (Item item, int amount) {
        int actualCondition = itemStock().get(item);
        int newCondition = actualCondition +amount;
        itemStock().put( item,newCondition);
    }

}
