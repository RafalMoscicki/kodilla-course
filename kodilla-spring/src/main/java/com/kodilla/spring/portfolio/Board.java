package com.kodilla.spring.portfolio;

public class Board {

    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList,
                 final TaskList inProgressList,
                 final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void addTaskToToDoList(String task) {
        toDoList.getTask(task);
    }

    public void addTaskToInProgressList(String task) {
        inProgressList.getTask(task);
    }

    public void addTaskToDoneList(String task) {
        doneList.getTask(task);
    }
}
