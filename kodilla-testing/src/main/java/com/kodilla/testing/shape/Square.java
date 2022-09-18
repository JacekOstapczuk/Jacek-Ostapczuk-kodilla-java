package com.kodilla.testing.shape;

public class Square implements Shape{

    public String getShapeName( ) {
        return "square";
    }

    public int getField() {
        return  25;
    }

    public String toString () {
    return "Name of shape is: " + getShapeName( ) + " its field is " + getField();

    }
    }
