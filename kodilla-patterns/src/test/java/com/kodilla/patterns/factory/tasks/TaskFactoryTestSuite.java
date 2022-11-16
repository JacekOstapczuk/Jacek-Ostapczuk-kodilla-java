package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

        @Test
        void testShoppingTask() {

        //Given
            TaskFactory taskFactory = new TaskFactory();
        //When
            Task work = taskFactory.taskFactory(TaskFactory.SHOPPING);
        //Then
            assertEquals("paintings staple",work.getTaskName());
            assertEquals(false, work.isTaskExecuted());
            work.executeTask();
            assertEquals(true, work.isTaskExecuted());
    }

    @Test
    void testPaintingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task work = taskFactory.taskFactory(TaskFactory.PAINTING);
        //Then
        assertEquals("malowanie pokoju",work.getTaskName());
        assertEquals(false, work.isTaskExecuted());
        work.executeTask();
        assertEquals(true, work.isTaskExecuted());

    }

    @Test
    void testDrivingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task work = taskFactory.taskFactory(TaskFactory.DRIVING);
        //Then
        assertEquals("wyjazd do sklepu",work.getTaskName());
        assertEquals(false, work.isTaskExecuted());
        work.executeTask();
        assertEquals(true, work.isTaskExecuted());

    }
}
