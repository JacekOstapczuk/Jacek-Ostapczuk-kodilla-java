/* package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
private  TaskListDao taskListDao;

    @Test
public void     testFindByListName() {

        //Given
        TaskList taskList = new  TaskList("Lista testowa" , "To jest zawartosc listy testowej");
        taskListDao.save( taskList );

        //When
        List<TaskList> findTask =  taskListDao.findByListName("Lista testowa");

        //Then
        assertEquals("Lista testowa", findTask.get(0).getListName());

        //CleanUp
        int id = findTask.get(0).getId();
        taskListDao.deleteById(id);
    }
}

 */