package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements  Task {
    String taskName;
    String whatToBuy;
    double quantity;
    static boolean isTaskExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void executeTask(){
        System.out.println(" Wykonuje powierzone zadanie " + taskName +
                " polegajace na kupnie " + whatToBuy +" w ilosci " + quantity);
        isTaskExecuted = true;
    }

    public String getTaskName(){
     return this.taskName;
    }

    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
