package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {

    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate userBirthDate;
    private final int userPosts;

    public ForumUser(final int userId,
                     final String userName,
                     final char userSex,
                     final LocalDate userBirthDate,
                     final int userPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirthDate = userBirthDate;
        this.userPosts = userPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getUserPosts() {
        return userPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userBirthDate=" + userBirthDate +
                ", userPosts=" + userPosts +
                '}';
    }
}
