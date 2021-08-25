package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testBoardAddTaskToToDoList() {
        //Given

        //When
        board.addTaskToToDoList("Do one more kodilla module");

        //Then
        assertTrue(board.getToDoList().getTasks().contains("Do one more kodilla module"));
    }

    @Test
    void testBoardAddTaskToInProgressList() {
        //Given

        //When
        board.addTaskToInProgressList("Doing kodilla module 10.3");

        //Then
        assertTrue(board.getInProgressList().getTasks().contains("Doing kodilla module 10.3"));
    }

    @Test
    void testBoardAddTaskToDoneList() {
        //Given

        //When
        board.addTaskToDoneList("Finally im done with this task");

        //Then
        assertTrue(board.getDoneList().getTasks().contains("Finally im done with this task"));
    }
}
