package com.kodilla.testing.forum.statistics;

public class StatisticsProcessor {

    private Statistics statistics;

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public StatisticsProcessor(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        if (statistics.usersNames().size() != 0) {
            this.averagePostsPerUser = (double) statistics.postsCount() / statistics.usersNames().size();
            this.averageCommentsPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        } else {
            this.averagePostsPerUser = 0;
            this.averageCommentsPerUser = 0;
        }
        if (statistics.postsCount() != 0) {
            this.averageCommentsPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        } else {
            this.averageCommentsPerPost = 0;
        }
    }

    public String showStatistics() {
        return toString();
    }

    @Override
    public String toString() {
        return  "statistics=" + statistics +
                ", usersCount=" + usersCount +
                ", postsCount=" + postsCount +
                ", commentsCount=" + commentsCount +
                ", averagePostsPerUser=" + averagePostsPerUser +
                ", averageCommentsPerUser=" + averageCommentsPerUser +
                ", averageCommentsPerPost=" + averageCommentsPerPost;
    }
}
