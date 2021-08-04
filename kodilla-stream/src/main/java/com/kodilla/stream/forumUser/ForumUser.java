package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {

    private final int iD;
    private final String name;
    private final char sex;
    private final LocalDate birthDate;
    private final int posts;

    public ForumUser(final int userId,
                     final String userName,
                     final char userSex,
                     final LocalDate userBirthDate,
                     final int userPosts) {
        this.iD = userId;
        this.name = userName;
        this.sex = userSex;
        this.birthDate = userBirthDate;
        this.posts = userPosts;
    }

    public int getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + iD +
                ", userName='" + name + '\'' +
                ", userSex=" + sex +
                ", userBirthDate=" + birthDate +
                ", userPosts=" + posts +
                '}';
    }
}
