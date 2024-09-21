package me.dora.katas.kyu8and7.numbertodigit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class NumberToDigitTest {

    NumberToDigit numberToDigit = new NumberToDigit();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new String[]{"0"}, 0),
                Arguments.of(new String[]{"1"}, 1),
                Arguments.of(new String[]{"1", "10"}, 10),
                Arguments.of(new String[]{"3", "34", "348"}, 348),
                Arguments.of(new String[]{"7", "79", "795", "7956"}, 7956),
                Arguments.of(new String[]{"5", "51", "510", "5103", "51037"}, 51037)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void createArrayOfTiers(String[] expected, int number) {
        String[] result = numberToDigit.createArrayOfTiers(number);

        Assertions.assertArrayEquals(expected, result);
    }
}