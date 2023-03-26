package com.kodilla.patterns2.observer.homework;

public interface TasksObservable {

    public void registerTasksObservers(TasksObserver tasksObserver);

    public void notifyTasksObservers();

    public void removeTasksObservers(TasksObserver tasksObserver);
}
