package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/positive.csv")

    public void shouldCalculateUnderLimit (int expected, int rangeMin, int rangeMax) {
        SqrService service = new SqrService();

        int actual = service.calcSqrRange(rangeMin, rangeMax);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/negative.csv")

    public void shouldntCalculateOverLimit (int expected, int rangeMin, int rangeMax) {
        SqrService service = new SqrService();

        int actual = service.calcSqrRange(rangeMin, rangeMax);

        Assertions.assertEquals(expected, actual);
    }

}
