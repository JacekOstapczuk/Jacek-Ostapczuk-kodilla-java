package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    public void tasksUpdate() {
        // Given
        Student student1 = new Student("Krzys");
        Student student2 = new Student("Rys");
        Student student3 = new Student("Mis");
        Mentor mentor1 = new Mentor("Severius");
        Mentor mentor2 = new Mentor("Dumbledor");
        student1.registerTasksObservers(mentor1);
        student2.registerTasksObservers(mentor1);
        student3.registerTasksObservers(mentor2);

        // When
        student1.addTask("skacz");
        student1.addTask("plywaj");
        student1.addTask("biegaj");
        student1.addTask("padnij");
        student2.addTask("pisz");
        student2.addTask("rysuj");
        student2.addTask("licz");
        student3.addTask("spiewaj");
        student3.addTask("tancz");

        // Then
        assertEquals(7, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());


    }
}