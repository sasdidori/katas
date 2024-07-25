package me.dora.katas.kyu8and7.volumesofcuboids;

import me.dora.katas.kyu8and7.volumesofcuboids.CuboidVolumes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CuboidVolumesTest {
    CuboidVolumes cuboidVolumes = new CuboidVolumes();

    @Test
    void findDifference() {
        int[] first = {2, 2, 4};
        int[] second = {3, 5, 3};
        int result = cuboidVolumes.findDifference(first, second);
        int expected = 29;
        Assertions.assertEquals(expected, result);
    }
}