package me.dora.katas.kyu8and7.splitstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SplitTest {
    Split split = new Split();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new String[]{}, ""),
                Arguments.of(new String[]{"a_"}, "a"),
                Arguments.of(new String[]{"ab"}, "ab"),
                Arguments.of(new String[]{"ab", "c_"}, "abc"),
                Arguments.of(new String[]{"ab", "cd"}, "abcd")
        );
    }

    @ParameterizedTest
    @MethodSource(("parameters"))
    void split(String[] expected, String input) {
        String[] result = split.split(input);

        Assertions.assertArrayEquals(expected, result);
    }
}