package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Learning", "Hibernate");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> task = taskListDao.findByListName(name);

        //Then
        assertEquals("Hibernate", task.get(0).getDescription());
        assertEquals(1, task.size());

        //CleanUp
        int id = task.get(0).getId();
        taskListDao.deleteById(id);
    }
}
