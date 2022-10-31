package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;



public class OrderList {

    public static List <Order> orderList() {
        List<Order> orderList= new ArrayList<>();
        orderList.add(new Order(UsersList.tomCruise , ItemGlossary. kAPCIE_ZIEOLE , 5));
        orderList.add(new Order(UsersList.tomHardy , ItemGlossary.sZCZOTECZKA_SONICZNA , 1));
        orderList.add(new Order(UsersList.tomCruise , ItemGlossary.sZCZOTECZKA_SONICZNA , 1));
        orderList.add(new Order(UsersList.monikaLevinski , ItemGlossary.sZCZOTECZKA_SONICZNA , 1));
        orderList.add(new Order(UsersList.monikaLevinski , ItemGlossary.bUTY_NA_OBCASIE , 1));
        orderList.add(new Order(new User("Kasia", "Gałczyńska", 999) , ItemGlossary.sZCZOTECZKA_SONICZNA , 1));
        return orderList;
    }

}
