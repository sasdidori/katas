package me.dora.katas.kyu8and7.centuryfromyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CenturyFromYearTest {

    CenturyFromYear centuryFromYear = new CenturyFromYear();

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "1, 2",
            "1, 100",
            "2,101",
            "19, 1900",
            "20, 1901",
            "28 ,2742",
            "201, 20001"
    })
    void CenturyFromYear(int expected, int number){
        int result = centuryFromYear.century(number);

        Assertions.assertEquals(expected, result);
    }

}