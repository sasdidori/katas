package me.dora.katas.kyu8and7.betweennumbers;
import me.dora.katas.kyu8and7.betweennumbers.GetNumbersInBetween;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GetNumbersInBetweenTest {
    GetNumbersInBetween getNumbersInBetween = new GetNumbersInBetween();

    @Test
    void between() {
        int[] result = getNumbersInBetween.between(2, 8);
        int[] expected = {2, 3, 4, 5, 6, 7, 8};
        Assertions.assertArrayEquals(expected, result);
    }
}