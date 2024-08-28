package me.dora.katas.kyu8and7.highestandlowest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HighestAndLowestTest {

    HighestAndLowest highestAndLowest = new HighestAndLowest();
    @ParameterizedTest
    @CsvSource({
            "'' ,'' ",
            "-1 -3, -2 -3 -1",
            "0 -1, -1 0",
            "2 -1, -1 0 2 1",
            "9 0, 0 5 2 9"
    })
    void highAndLow(String expected, String numbers) {
        String result = highestAndLowest.highAndLow(numbers);

        Assertions.assertEquals(expected, result);
    }
}