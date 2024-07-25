package me.dora.katas.kyu8and7.terminalgame;

import me.dora.katas.kyu8and7.terminalgame.MoveCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveCalculatorTest {
    MoveCalculator movecalculator = new MoveCalculator();

    @Test
    void move() {
        int result = movecalculator.move(1, 5);
        Assertions.assertEquals(11, result);
    }
}