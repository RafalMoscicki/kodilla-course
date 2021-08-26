package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private Logger logger = Logger.INSTANCE;

    @Test
    void testGetLastLog() {
        //Given
        logger.log("changing first log");
        logger.log("changing second log");

        //When
        String lastLog = logger.getLastLog();

        //Then
        assertEquals(lastLog, "changing second log");
    }
}
