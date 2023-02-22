package com.kodilla.hibernate.invoice.dao.task.dao;


import com.kodilla.hibernate.invoice.dao.task.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Transactional
@Repository
public interface TaskListDao extends CrudRepository<TaskList, Integer> {

}