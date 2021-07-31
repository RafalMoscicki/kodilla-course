package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsProcessorTestSuite {

    @Mock
    private Statistics statisticsMock;

    @InjectMocks
    private StatisticsProcessor statisticsProcessor;

    @Test
    void testCalculateAdvStatisticsWhen0Posts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        //Then
        assertStatistics(statisticsProcessor, 0, 0, 0, 0, 0, 0);
    }

    @Test
    void testCalculateAdvStatisticsWhen1000Posts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        //Then
        assertStatistics(statisticsProcessor, 0, 1000, 0, 0, 0, 0);    }

    @Test
    void testCalculateAdvStatisticsWhen0Comments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        //Then
        assertStatistics(statisticsProcessor, 0, 0, 0, 0, 0, 0);    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsLessThanPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);

        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        //Then
        assertStatistics(statisticsProcessor, 0, 100, 50, 0.5, 0, 0);    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsMoreThanPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        //Then
        assertStatistics(statisticsProcessor, 0, 50, 100, 2, 0, 0);    }

    @Test
    void testCalculateAdvStatisticsWhen0Users() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        //Then
        assertStatistics(statisticsProcessor, 0, 0, 0, 0, 0, 0);    }

    @Test
    void testCalculateAdvStatisticsWhen100Users() {
        //Given
        List<String> users = generateUsers(1000);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        //Then
        assertStatistics(statisticsProcessor, 1000, 0, 0, 0, 0, 0);
    }

    private static List<String> generateUsers(int userCount) {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < userCount; i++) {
            users.add("abc");
        }
        return users;
    }

    private static void assertStatistics(
            StatisticsProcessor statisticsProcessor,
            int userCount,
            int postCount,
            int commentCount,
            double avgCommentPerPost,
            double avgCommentPerUser,
            double avgPostPerUser) {
        Assertions.assertEquals(userCount, statisticsProcessor.getUsersCount());
        Assertions.assertEquals(postCount, statisticsProcessor.getPostsCount());
        Assertions.assertEquals(commentCount, statisticsProcessor.getCommentsCount());
        Assertions.assertEquals(avgCommentPerPost, statisticsProcessor.getAverageCommentsPerPost(), 0.001);
        Assertions.assertEquals(avgCommentPerUser, statisticsProcessor.getAverageCommentsPerUser(), 0.001);
        Assertions.assertEquals(avgPostPerUser, statisticsProcessor.getAveragePostsPerUser(), 0.001);
    }
}
