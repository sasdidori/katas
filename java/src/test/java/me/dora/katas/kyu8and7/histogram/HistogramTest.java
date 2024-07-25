package me.dora.katas.kyu8and7.histogram;

import me.dora.katas.kyu8and7.histogram.Histogram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class HistogramTest {
    Histogram histogram = new Histogram();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Number of rolls too high", new int[]{90, 2, 1, 0, 3, 7}),
                Arguments.of("6|\n" +
                        "5|\n" +
                        "4|\n" +
                        "3|\n" +
                        "2|\n" +
                        "1|\n", new int[]{0, 0, 0, 0, 0, 0}),
                Arguments.of("6|\n" +
                        "5|\n" +
                        "4|\n" +
                        "3|\n" +
                        "2|\n" +
                        "1|## 2\n", new int[]{2, 0, 0, 0, 0, 0}),
                Arguments.of("6|# 1\n" +
                        "5|## 2\n" +
                        "4|######## 8\n" +
                        "3|###### 6\n" +
                        "2|### 3\n" +
                        "1|# 1\n", new int[]{1, 3, 6, 8, 2, 1}),
                Arguments.of("6|\n" +
                        "5|###### 6\n" +
                        "4|\n" +
                        "3|### 3\n" +
                        "2|\n" +
                        "1|##### 5\n", new int[]{5, 0, 3, 0, 6, 0}),
                Arguments.of("6|##### 5\n" +
                        "5|\n" +
                        "4|# 1\n" +
                        "3|########## 10\n" +
                        "2|### 3\n" +
                        "1|####### 7\n", new int[]{7, 3, 10, 1, 0, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void histogram(String expected, int[] values) {
        String result = histogram.histogram(values);
        Assertions.assertEquals(expected, result);
    }
}