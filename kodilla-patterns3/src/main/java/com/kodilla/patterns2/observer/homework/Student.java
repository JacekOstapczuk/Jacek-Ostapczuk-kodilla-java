package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class Student implements TasksObservable {

    private final List<TasksObserver> tasksObservers;

    private final List<String> tasks;

    private final String name;

    public Student(String name){
        tasksObservers = new ArrayList<>();
        tasks= new ArrayList<>();
        this.name=name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyTasksObservers();
    }

    @Override
    public void registerTasksObservers(TasksObserver tasksObserver){
        tasksObservers.add(tasksObserver);
    };

    @Override
    public void notifyTasksObservers() {
        for (TasksObserver tasksObserver : tasksObservers) {
            tasksObserver.updateTask(this);
        }
    }

    @Override
    public     void removeTasksObservers(TasksObserver tasksObserver){
        tasksObservers.remove(tasksObserver);
    };


    public String getName() {
        return name;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
