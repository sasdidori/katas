package me.dora.katas.kyu8and7.numberofdecimaldigits;

import me.dora.katas.kyu8and7.numberofdecimaldigits.NumberOfDecimalDigits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfDecimalDigitsTest {

    NumberOfDecimalDigits numberOfDecimalDigits = new NumberOfDecimalDigits();

    @Test
    void digits() {

        int result = numberOfDecimalDigits.digits(123456);
        int expected = 6;
        Assertions.assertEquals(result, expected);
    }
}