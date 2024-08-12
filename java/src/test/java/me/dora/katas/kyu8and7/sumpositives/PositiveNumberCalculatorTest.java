package me.dora.katas.kyu8and7.sumpositives;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PositiveNumberCalculatorTest {
    PositiveNumberCalculator positiveNumberCalculator = new PositiveNumberCalculator();
    int sumOfNumbers = positiveNumberCalculator.sum(positiveNumberCalculator.arr);

    @Test
    void sumOfNumbers() {
        Assertions.assertEquals(8, sumOfNumbers);
    }

    @Test
    void isArrayEmpty() {
        Assertions.assertTrue(positiveNumberCalculator.arr.length != 0);
    }
}