package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(123, "Adam", 'M',
                LocalDate.of(1990, 5, 6), 10));
        forumUserList.add(new ForumUser(124, "Kasia", 'W',
                LocalDate.of(1991, 6, 22), 100));
        forumUserList.add(new ForumUser(125, "Iwona", 'W',
                LocalDate.of(1995, 7, 30), 5));
        forumUserList.add(new ForumUser(126, "Alex", 'M',
                LocalDate.of(2000, 12, 18), 185));
        forumUserList.add(new ForumUser(127, "Piotr", 'M',
                LocalDate.of(1980, 1, 4), 20));
        forumUserList.add(new ForumUser(128, "Iza", 'W',
                LocalDate.of(1985, 2, 16), 30));
    }

    public List<ForumUser> getUsers() {
        return new ArrayList<>(forumUserList);
    }
}
