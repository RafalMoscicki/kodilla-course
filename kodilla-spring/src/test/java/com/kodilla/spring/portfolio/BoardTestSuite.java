package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        System.out.println(board.getToDoList().getTasks());
    }

    @Test
    void testBoardAddTaskToInProgressList() {
        //Given

        //When
        board.addTaskToInProgressList("Doing kodilla module 10.3");

        //Then
        System.out.println(board.getInProgressList().getTasks());
    }

    @Test
    void testBoardAddTaskToDoneList() {
        //Given

        //When
        board.addTaskToDoneList("Finally im done with this task");

        //Then
        System.out.println(board.getDoneList().getTasks());
    }
}
