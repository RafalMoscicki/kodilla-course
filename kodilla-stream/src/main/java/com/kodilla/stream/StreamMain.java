package com.kodilla.stream;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserMap = forum.getForumUserList().stream()
                .filter(sex -> sex.getUserSex() == 'M')
                .filter(age -> age.getUserBirthDate().getYear() < 2001)
                .filter(post -> post.getUserPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        forumUserMap.entrySet()
                .forEach(System.out::println);
    }
}
