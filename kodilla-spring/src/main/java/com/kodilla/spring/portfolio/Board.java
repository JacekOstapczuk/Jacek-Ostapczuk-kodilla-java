package com.kodilla.spring.portfolio;

public class Board {
    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

}
