package me.dora.katas.kyu8and7.evenorodd;

import me.dora.katas.kyu8and7.evenorodd.EvenOrOdd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenOrOddTest {

    EvenOrOdd evenOrOdd = new EvenOrOdd();

    @Test
    void even_or_odd() {
        String result = evenOrOdd.even_or_odd(5);
        String expected = "Odd";
        Assertions.assertEquals(expected, result);
    }
}