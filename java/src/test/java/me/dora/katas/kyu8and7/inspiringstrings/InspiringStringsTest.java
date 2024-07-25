package me.dora.katas.kyu8and7.inspiringstrings;

import me.dora.katas.kyu8and7.inspiringstrings.InspiringStrings;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InspiringStringsTest {
    InspiringStrings inspiringStrings = new InspiringStrings();

    @ParameterizedTest
    @CsvSource({
            "aaa, aaa a aa",
            "aaa, aa aaa aa",
            "aaa, a aa aaa",
            "aaa, abb aaa a",
            "aaa, a abb aaa",
            "aaa, abb aa acc aaa"
    })
    void longestWord(String expected, String word) {
        String result = inspiringStrings.longestWord(word);
        assertEquals(expected, result);
    }
}