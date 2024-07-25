package me.dora.katas.kyu8and7.fakebinary;

import me.dora.katas.kyu8and7.fakebinary.FakeBinary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FakeBinaryTest {
    FakeBinary fakeBinary = new FakeBinary();

    @Test
    void fakeBin() {
        String result = fakeBinary.fakeBin("72");
        String expected = "10";
        Assertions.assertEquals(expected, result);
    }
}