package me.dora.katas.kyu8and7.countbyx;

import me.dora.katas.kyu8and7.countbyx.Count;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CountTest {

    private final Count count = new Count();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 1, 3),
                Arguments.of(new int[]{2, 4, 6, 8}, 2, 4),
                Arguments.of(new int[]{1}, 1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void countBy(int[] expected, int number1, int number2) {
        int[] result = count.countBy(number1, number2);
        Assertions.assertArrayEquals(expected, result);
    }
}