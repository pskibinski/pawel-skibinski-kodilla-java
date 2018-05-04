package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklists.TaskList;
import com.kodilla.hibernate.tasklists.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Work to do";
    private static final String LISTNAME = "To do list";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);

        //When
        String listName = taskList.getListName();
        List<TaskList> readLists = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readLists.size());

        //CleanUp
        taskListDao.delete(readLists.get(0).getId());
    }
}
