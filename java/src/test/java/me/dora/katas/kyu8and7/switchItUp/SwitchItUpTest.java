package me.dora.katas.kyu8and7.switchItUp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SwitchItUpTest {

    SwitchItUp switchItUp = new SwitchItUp();

    @ParameterizedTest
    @CsvSource({
            "'Zero', 0",
            "'One', 1",
            "'Two', 2",
            "'Nine', 9"
    })
    void switching(String expected, int number) {
        String result = switchItUp.switchIt(number);
        Assertions.assertEquals(expected, result);
    }
}