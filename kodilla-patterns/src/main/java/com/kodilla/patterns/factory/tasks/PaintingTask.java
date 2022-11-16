package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements  Task{
    String taskName;
    String color;
    String whatToPaint;
    static boolean isTaskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public void executeTask(){
        System.out.println(" Wykonuje powierzone zadanie " + taskName +
                " polegajace na pomalowaniu kolorem  " + color +" obiektu " + whatToPaint);
        isTaskExecuted = true;
    }

    public String getTaskName(){
        return this.taskName;
    }

    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
