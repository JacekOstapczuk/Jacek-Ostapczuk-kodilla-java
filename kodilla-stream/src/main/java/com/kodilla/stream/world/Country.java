package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    BigDecimal peopleQuantity;

    public Country(BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    BigDecimal getPeopleQuantity(){
      return peopleQuantity;
  }
}
