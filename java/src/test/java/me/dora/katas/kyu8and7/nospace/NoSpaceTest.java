package me.dora.katas.kyu8and7.nospace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NoSpaceTest {
    NoSpace noSpace = new NoSpace();

    @ParameterizedTest
    @CsvSource({
            "``, ``",
            "jj, j j",
            "jjjj, j jj j",
            "jj, jj",
            "jjjj ,j j  j j "
    })

    void noSpace(String expected, String word){
       String result = noSpace.noSpace(word);

        Assertions.assertEquals(expected, result);
    }

}