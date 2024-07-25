package me.dora.katas.kyu8and7.catsandshelves;

import me.dora.katas.kyu8and7.catsandshelves.CatsAndShelves;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatsAndShelvesTest {
    CatsAndShelves catsAndShelves = new CatsAndShelves();

    @ParameterizedTest
    @CsvSource({
            "1, 1, 2",
            "1, 1, 4",
            "1, 2, 3",
            "1, 2, 5",
            "2, 1, 3",
            "2, 1, 7",
            "2, 1, 5"
    })
    void solution(int expected, int start, int finish) {
        int result = catsAndShelves.solution(start, finish);
        assertEquals(expected, result);
    }
}