package me.dora.katas.kyu8and7.catsanddogs;
import me.dora.katas.kyu8and7.catsanddogs.CatsAndDogs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatsAndDogsTest {
    CatsAndDogs catsAndDogs = new CatsAndDogs();

    @Test
    void humanYearsCatYearsDogYears() {
        int[] result = catsAndDogs.humanYearsCatYearsDogYears(5);
        int[] expected = {5, 36, 39};
        Assertions.assertArrayEquals(result, expected);
    }
}