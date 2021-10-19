package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Task implements Observable {

    private final String name;
    private final List<String> tasks;
    private final List<Observer> observers;

    public Task(String name) {
        this.name = name;
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
