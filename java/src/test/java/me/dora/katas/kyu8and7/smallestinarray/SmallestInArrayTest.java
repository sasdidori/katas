package me.dora.katas.kyu8and7.smallestinarray;

import me.dora.katas.kyu8and7.smallestinarray.SmallestInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestInArrayTest {
    SmallestInArray smallestInArray = new SmallestInArray();

    @Test
    void findSmallestInt() {
        int result = smallestInArray.findSmallestInt(new int[]{12, 4, 5, 3});
        int expected = 3;
        Assertions.assertEquals(expected, result);
    }
}