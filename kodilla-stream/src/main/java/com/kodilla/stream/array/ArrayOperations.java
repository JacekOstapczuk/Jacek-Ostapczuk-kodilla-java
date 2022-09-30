package com.kodilla.stream.array;

import java.util.stream.IntStream;

public   interface ArrayOperations {

    public static  double  getAverage(int[] numbers) {

                 IntStream.range(0,numbers.length)
                 .forEach(n-> System.out.print(" "+numbers[n]));

        double tableNumber =  IntStream.range(0,numbers.length)
              .map ( n-> numbers[n])
                .mapToDouble (n->n)
                .average().getAsDouble();
        return  tableNumber;
    }
}
