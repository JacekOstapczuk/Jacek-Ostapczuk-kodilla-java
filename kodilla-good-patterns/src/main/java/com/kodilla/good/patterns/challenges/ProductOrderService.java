package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

public class ProductOrderService {

  Map mapOfItems =ItemStock.itemStock();
  List<Order> newOrders = OrderList.orderList();

    public boolean isUserRegistered (Order order) {
        if (!UsersList.usersList().contains(order.getUser())){
          System.out.println("zamówienie od niezarejestrowanego użytkowanika: " + order.getUser().getName() +" " +order.getUser().getSurname()  + " konieczna rejestracja przed realizacją zamówienie");
        } return (UsersList.usersList().contains(order.getUser()));
    }

    public boolean isItemAvailable(Order order) {
       if (!mapOfItems.containsKey(order.getItem())){
           System.out.println("Towar nie znajduje się w sprzedaży: " +order.getItem().getName());
       } return (mapOfItems.containsKey(order.getItem()));
    }

    public boolean isSufficientQuantityOfItems(Order order) {
        Item requestedItem = order.getItem();
       Object requestedItemAmountObject = mapOfItems.get(requestedItem);
        int requestedItemAmount = (int)requestedItemAmountObject;

        if (!(requestedItemAmount >= order.getQuantity())){
            System.out.println("Nie ma wystarczającej ilości do realizacji zamówienia: "  +order.getItem().getName());
        } return (requestedItemAmount >= order.getQuantity());
    }

    public  Map <Item, Integer> orderService (Order order) {
        Item requestedItem = order.getItem();
        int requestedAmount = order.getQuantity();
        Object requestedAmountObject = mapOfItems.get(requestedItem);
        int requestedItemAmount = (int)requestedAmountObject;
        int actualAmount = requestedItemAmount - requestedAmount;
        mapOfItems.put(requestedItem,actualAmount );
        System.out.println("Zrealizowano zamówienie na: " + order.getItem().getName() + "w ilości: " + requestedAmount );
        return mapOfItems;
    }

    public void runOrders(){
        for (Order order:  newOrders ) {
            if  (isUserRegistered (order)){
               if (isItemAvailable(order)){
                if (isSufficientQuantityOfItems(order)) {
                    orderService (order);
                }
               }
            }
        }
        System.out.println("Stan magazynu po realizacji zamówień");
        System.out.println(mapOfItems.get(ItemGlossary.wIEDZMIN_3_WERSJA_PUDELKOW));
        System.out.println(mapOfItems.get(ItemGlossary.kAPCIE_ZIEOLE));
        System.out.println(mapOfItems.get(ItemGlossary.sZCZOTECZKA_SONICZNA));
    }
}
