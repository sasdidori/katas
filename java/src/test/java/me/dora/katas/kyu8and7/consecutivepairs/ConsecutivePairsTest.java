package me.dora.katas.kyu8and7.consecutivepairs;

import me.dora.katas.kyu8and7.consecutivepairs.ConsecutivePairs;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsecutivePairsTest {
    ConsecutivePairs consecutivePairs = new ConsecutivePairs();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(0, new int[]{0, 0}),
                Arguments.of(0, new int[]{-1, -1, -2}),
                Arguments.of(1, new int[]{0, 1}),
                Arguments.of(2, new int[]{0, 1, 0, -1}),
                Arguments.of(2, new int[]{1, 2, 5, 8, 9, 10}),
                Arguments.of(2, new int[]{1, 2, 5, 8, 9, 10, 11}),
                Arguments.of(2, new int[]{0, -1, -7, 8, -20, -21}),
                Arguments.of(2, new int[]{0, 1, -7, 8, -20, -19, -18}),
                Arguments.of(3, new int[]{1, 2, -4, -5, -8, -7}),
                Arguments.of(3, new int[]{1, 2, -4, -5, -8, -7, 13})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void solve(int expected, int[] numbers) {
        int result = consecutivePairs.solve(numbers);
        assertEquals(expected, result);
    }
}