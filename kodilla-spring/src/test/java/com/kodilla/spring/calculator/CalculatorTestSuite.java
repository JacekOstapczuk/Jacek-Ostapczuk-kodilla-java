package com.kodilla.spring.calculator;

import org.aopalliance.aop.AspectException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
   void  testCalculations(){
        //Given

        //When
        double addResult = calculator.add(3, 3);
        double subResult = calculator.sub(10, 5);
        double mulResult = calculator.mul (2,4);
        double divResult = calculator.div(15,2);
        //Then
        Assertions.assertEquals(6, addResult);
        Assertions.assertEquals(5, subResult);
        Assertions.assertEquals(8, mulResult);
        Assertions.assertEquals(7.5, divResult);
    }
}
