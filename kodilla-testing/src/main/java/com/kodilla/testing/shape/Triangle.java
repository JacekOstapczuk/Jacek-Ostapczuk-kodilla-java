package com.kodilla.testing.shape;

public class Triangle implements Shape {
    public String getShapeName( ) {
       return "triangel";
    }

    public int getField() {
        return  12;
    }

    public String toString () {
        return "Name of shape is: " + getShapeName() + " its field is " + getField();
    }
}
