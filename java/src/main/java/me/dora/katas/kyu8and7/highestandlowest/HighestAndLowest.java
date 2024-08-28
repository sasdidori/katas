package me.dora.katas.kyu8and7.highestandlowest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighestAndLowest {
    public String highAndLow(String numbers) {
        if (!numbers.isEmpty()) {
            String[] numbersAsStringArray = numbers.split(" ");
            List<Integer> numbersList = Arrays.stream(numbersAsStringArray).toList().stream().map(Integer::parseInt).toList();
            int smallest = Collections.min(numbersList);
            int biggest = Collections.max(numbersList);
            return biggest + " " + smallest;
        }
        return "";
    }
}
