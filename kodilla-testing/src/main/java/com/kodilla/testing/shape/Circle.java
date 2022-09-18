package com.kodilla.testing.shape;

public class Circle implements Shape {

    public String getShapeName( ) {
        return "circle";
    }

    public int getField() {
        return  30;
    }

    public String toString () {
        return "Name of shape is: " + getShapeName() + " its field is " + getField();
    }

}