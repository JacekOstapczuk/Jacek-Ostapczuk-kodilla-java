package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task taskFactory(final String taks) {
        return    switch (taks) {
            case SHOPPING -> new ShoppingTask("paintings staple", "brush", 2);
            case PAINTING -> new PaintingTask("malowanie pokoju", "zielony", "sciana");
            case DRIVING -> new DrivingTask("wyjazd do sklepu", "sklep z narzedziami", "furgonetka");
            default -> null;
        };
    }
}
