package com.kodilla.exception.io;

import com.kodilla.exception.test.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    void testReadFile() {
        //Given
        FileReader fileReader = new FileReader();

        //When
        assertDoesNotThrow(() -> fileReader.readFile());
    }

    @Test
    void whenFileDoesntExistsReadFileShouldThrowException() {
        //Given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku";

        //When & Then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }

    @Test
    public void testReadFileWithName() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }

    @Test
    public void testProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.0, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 2.0))
        );
    }

    @Test
    public void testScanExceptions() {
        //Given
        UserInputChecker userInputChecker = new UserInputChecker();

        //When & Then
        assertAll(
                () -> assertThrows(InvalidFormatException.class, () -> userInputChecker.scan("ala")),
                () -> assertThrows(NumberOutOfRangeException.class, () -> userInputChecker.scan("12")),
                () -> assertDoesNotThrow(() -> userInputChecker.scan("5"))
        );
    }
}
