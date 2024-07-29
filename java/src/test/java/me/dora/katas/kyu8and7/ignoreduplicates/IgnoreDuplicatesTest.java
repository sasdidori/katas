package me.dora.katas.kyu8and7.ignoreduplicates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class IgnoreDuplicatesTest {
    IgnoreDuplicates ignoreDuplicates = new IgnoreDuplicates();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(0, new int[]{}),
                Arguments.of(0, new int[]{0}),
                Arguments.of(1, new int[]{1}),
                Arguments.of(0, new int[]{1, 1, 1}),
                Arguments.of(1, new int[]{0, 0, 1}),
                Arguments.of(0, new int[]{0, 1, 1}),
                Arguments.of(3, new int[]{0, 1, 2}),
                Arguments.of(6, new int[]{1, 2, 3, 4, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void sumNoDuplicates(int expected, int[] numbers) {
        int result = ignoreDuplicates.sumNoDuplicates(numbers);

        Assertions.assertEquals(expected, result);
    }
}