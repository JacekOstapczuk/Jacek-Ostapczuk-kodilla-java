package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumber = new ArrayList <>();
        for (int i = 0; i < numbers.size(); i++) {
        if (numbers.get(i) !=0 && numbers.get(i) %2==0) {
            evenNumber.add(numbers.get(i));
             }
        } return evenNumber;
        }
    }
