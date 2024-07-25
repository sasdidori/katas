package me.dora.katas.kyu8and7.tonegative;

import me.dora.katas.kyu8and7.tonegative.ToNegative;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToNegativeTest {
    ToNegative toNegative = new ToNegative();

    @Test
    void makeNegative() {
        int result = toNegative.makeNegative(-8);
        int expected = -8;
        Assertions.assertEquals(expected, result);
    }
}