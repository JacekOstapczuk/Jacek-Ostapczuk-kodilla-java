package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculations = new Calculator();
        int addTest =  calculations.addAtoB(3,6);
         if (addTest == 9) {
             System.out.println("test dodawania - pozytywny");
         } else  {System.out.println("test dodawnia - negatywny");
         }

        int substractTest =calculations.substractAfromB (19, 4);
        if (substractTest==15) {
            System.out.println("test odejmowania - pozytywny");
        }   else { System.out.println("test odejmowania - negatywny");
        }
        }

}