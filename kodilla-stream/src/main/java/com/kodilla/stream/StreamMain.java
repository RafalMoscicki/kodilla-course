package com.kodilla.stream;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserMap = forum.getUsers().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> (ChronoUnit.YEARS.between(user.getBirthDate(), LocalDate.now())) > 20)
                .filter(user -> user.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getiD, user -> user));

        forumUserMap.entrySet()
                .forEach(System.out::println);
    }
}
