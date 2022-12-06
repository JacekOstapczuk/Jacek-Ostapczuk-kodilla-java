package com.kodilla.hibernate.tasklisttoexam.dao;


import com.kodilla.hibernate.tasklisttoexam.TaskListToExam;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListToExamDao taskListToExamDao;

    @Test
    public void     testFindByListName() {

        //Given
        TaskListToExam taskList = new TaskListToExam("Lista testowa" , "To jest zawartosc listy testowej");
        taskListToExamDao.save( taskList );

        //When
        List<TaskListToExam> findTask =   taskListToExamDao.findByListName("Lista testowa");

        //Then
        assertEquals("Lista testowa", findTask.get(0).getListName());

        //CleanUp
        int id = findTask.get(0).getId();
        taskListToExamDao.deleteById(id);
    }
}

