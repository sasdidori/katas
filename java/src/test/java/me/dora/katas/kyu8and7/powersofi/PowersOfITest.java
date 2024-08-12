package me.dora.katas.kyu8and7.powersofi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowersOfITest {

    PowersOfI powersOfI = new PowersOfI();

    @ParameterizedTest
    @CsvSource({
            "1, 0",
            "i, 1",
            "-1, 2",
            "-i, 3",
            "1, 4",
            "i, 5"
    })
    void pofi(String expected, int number) {
        String result = powersOfI.pofi(number);
        assertEquals(expected, result);
    }
}