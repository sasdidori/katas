package me.dora.katas.kyu8and7.hextodecimal;

import me.dora.katas.kyu8and7.hextodecimal.HexToDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HexToDecimalTest {
    HexToDecimal hexToDecimal = new HexToDecimal();

    @Test
    void hexToDec() {
        int result = hexToDecimal.hexToDec("100");
        Assertions.assertEquals(256, result);
    }
}