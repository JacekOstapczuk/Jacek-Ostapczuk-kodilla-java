package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public  Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public void showFiguresII() {
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }
    }

    public void showFigures() {
        String shapesNames ="";
        for (Shape shape : shapeList) {
            shapesNames = shapesNames + shape.getShapeName( )+" ";
    }System.out.println(shapesNames);

    }
}
