package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void   testTaskAdd() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("pozmywaj!");
        board.doneList.tasks.add("ugotuj!");
        board.inProgressList.tasks.add("zjedz!");
        //Then

        board.toDoList.tasks.stream()
            .forEach(System.out::println);

        board.inProgressList.tasks.stream()
                .forEach(System.out::println);

        board.doneList.tasks.stream()
                .forEach(System.out::println);
    }

}
