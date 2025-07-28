package me.dora.katas.kyu8and7.areaOfAnArrow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfAnArrowTest {

    AreaOfAnArrow areaOfAnArrow = new AreaOfAnArrow();

    @ParameterizedTest
    @CsvSource({
            "0.25, 1, 1",
            "1, 2, 2",
            "4.5, 3,6",
            "156.25, 25, 25",
            "2, 4, 2"
    })

    void area(double expected, int a, int b){
        double result = areaOfAnArrow.arrowArea(a, b);
        Assertions.assertEquals(expected, result);
    }


}