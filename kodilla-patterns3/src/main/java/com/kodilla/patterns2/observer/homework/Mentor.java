package com.kodilla.patterns2.observer.homework;

public class Mentor implements TasksObserver {

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName){
        this.mentorName=mentorName;
    }


    public void updateTask(Student student) {
        System.out.println(mentorName + ": New task " + student.getName() + "\n" +
                " (total: " + student.getTasks().size() + " messages)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

}
