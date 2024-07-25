package me.dora.katas.kyu8and7.reverse;

import me.dora.katas.kyu8and7.reverse.Reverse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ReverseTest {

    Reverse reverse = new Reverse();

    @ParameterizedTest
    @CsvSource({
            "oHlel, Hello",
            "504132,012345",
            "IH, HI"
    })
    void funReverse(String expected, String s) {
        String result = reverse.reverse(s);
        Assertions.assertEquals(expected, result);
    }
}