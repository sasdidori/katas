package me.dora.katas.kyu8and7.blowingcandles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BlowingCandlesTest {
    BlowingCandles blowingCandles = new BlowingCandles();

    @ParameterizedTest
    @CsvSource(delimiter = '|', textBlock = """
          
            0 | 0
            0 | 000
            6 | 02134
            3 |1321
            6 |2114
            3 |1321
            9 |0323456
    """)
    void blowCandles(int expected,String numbers) {
        int result = blowingCandles.blowCandles(numbers);

        Assertions.assertEquals(expected, result);
    }
}

// '' | 0

