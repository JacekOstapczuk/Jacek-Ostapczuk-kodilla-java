package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("TDD:  ShapeCollectorTestSuite")
public class ShapeCollectorTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void before() {
        System.out.println("Unit test start");
    }

    @AfterEach
    public void after() {
        System.out.println("Unit test end");
    }

    @Nested
    @DisplayName("Tests for FirstHalf")
    class ShapeTestsFirstHalf {

        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector list = new ShapeCollector();
            Circle circle = new Circle();

            //When
            list.addFigure(circle);

            //Then
            Assertions.assertEquals(  list.shapeList.get(0), circle);
        }

        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector list = new ShapeCollector();
            Circle circle = new Circle();
            list.addFigure(circle);

            //When
            list.removeFigure(circle);

            //Then
            Assertions.assertEquals(  list.shapeList.size(), 0);
        }
    }

    @Nested
    @DisplayName("Tests for SecondHalf")
    class ShapeTestsSecondHalf {

        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector list = new ShapeCollector();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            Square square = new Square();
            list.addFigure(circle);
            list.addFigure(triangle);
            list.addFigure(square);

            //When
            Shape takenShape = list.getFigure(1);

            //Then
            Assertions.assertEquals(  takenShape, triangle);

        }

        @Test
        public void testShowFiguresII() {
            //Given
            ShapeCollector list = new ShapeCollector();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            Square square = new Square();
            list.addFigure(circle);
            list.addFigure(triangle);
            list.addFigure(square);

            //When
            list.showFiguresII();

            //Then
        }

        @Test
        public void testShowFiguresI() {
            //Given
            ShapeCollector list = new ShapeCollector();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            Square square = new Square();
            list.addFigure(circle);
            list.addFigure(triangle);
            list.addFigure(square);

            //When
            list.showFigures();

            //Then
        }

    }
}