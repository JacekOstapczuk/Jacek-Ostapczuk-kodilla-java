package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public abstract class Company implements NameOfCompany, ListOfProducts, Process {

    public abstract String nameOfCompany();

    public abstract Map<String, Integer> listOfProducts();

    public abstract  Map<String, Integer> process(Order order);

}
