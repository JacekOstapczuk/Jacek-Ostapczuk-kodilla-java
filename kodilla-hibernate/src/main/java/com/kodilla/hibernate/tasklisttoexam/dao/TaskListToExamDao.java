package com.kodilla.hibernate.tasklisttoexam.dao;

import com.kodilla.hibernate.tasklisttoexam.TaskListToExam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Repository
public interface  TaskListToExamDao extends CrudRepository<TaskListToExam, Integer> {
    List<TaskListToExam> findByListName(String listName);
}
