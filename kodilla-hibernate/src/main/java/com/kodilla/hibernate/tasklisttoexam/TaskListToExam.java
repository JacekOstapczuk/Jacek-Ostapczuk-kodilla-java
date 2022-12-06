package com.kodilla.hibernate.tasklisttoexam;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

    @Entity
    @Table(name = "TASKLISTTOEXAM")
    public class TaskListToExam {

        private int id;
        private String listName;
        private String description;

        public TaskListToExam() {
        }

        public TaskListToExam(String listName, String description) {
            this.listName = listName;
            this.description = description;
        }

        @Id
        @NotNull
        @GeneratedValue
        @Column(name="ID", unique=true)
        public int getId() {
            return id;
        }

        @NotNull
        @Column(name="LISTNAME")
        public String getListName() {
            return listName;
        }

        @Column(name = "DESCRIPTION")
        public String getDescription() {
            return description;
        }

        private void setId(int id) {
            this.id = id;
        }

        private void setListName(String listName) {
            this.listName = listName;
        }

        private void setDescription(String description) {
            this.description = description;
        }
    }
