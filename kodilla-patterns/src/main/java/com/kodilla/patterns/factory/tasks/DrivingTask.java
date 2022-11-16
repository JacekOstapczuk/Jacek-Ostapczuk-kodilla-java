package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements  Task{
    String taskName;
    String where;
    String using;
    static boolean isTaskExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public void executeTask(){
        System.out.println(" Wykonuje powierzone zadanie " + taskName +
                " polegajace na pojechaniu do " +  where +" uzywajac " + using);
        isTaskExecuted = true;
    }

    public String getTaskName(){
        return this.taskName;
    }

    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
