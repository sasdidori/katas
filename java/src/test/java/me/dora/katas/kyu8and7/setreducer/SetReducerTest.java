package me.dora.katas.kyu8and7.setreducer;

import me.dora.katas.kyu8and7.setreducer.SetReducer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetReducerTest {
    SetReducer setReducer = new SetReducer();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(2, new int[]{0, 0}),
                Arguments.of(2, new int[]{0, 1}),
                Arguments.of(2, new int[]{1, 0}),
                Arguments.of(2, new int[]{1, 1}),
                Arguments.of(2, new int[]{1, 2}),
                Arguments.of(3, new int[]{3, 3, 3}),
                Arguments.of(2, new int[]{1, 3, 3}),
                Arguments.of(2, new int[]{3, 3, 1}),
                Arguments.of(3, new int[]{1, 2, 3}),
                Arguments.of(4, new int[]{1, 1, 1, 1}),
                Arguments.of(4, new int[]{1, 2, 3, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void setReducer(int expected, int[] parameters) {
        int result = setReducer.setReducer(parameters);
        assertEquals(expected, result);
    }
}