package me.dora.katas.kyu8and7.feastofbeasts;

import me.dora.katas.kyu8and7.feastofbeasts.Feast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FeastTest {
    Feast feast = new Feast();

    @ParameterizedTest
    @CsvSource({
            "true, monkey, moonpastry",
            "false, elephant, potato",
            "false, wolf, wakame",
            "false, zebra, pasta",
            "true, pie, pie"
    })
    void feast(boolean expected, String beast, String dish) {
        boolean result = feast.feast(beast, dish);
        Assertions.assertEquals(expected, result);
    }
}