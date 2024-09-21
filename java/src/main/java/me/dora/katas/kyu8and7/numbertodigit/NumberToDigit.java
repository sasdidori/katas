package me.dora.katas.kyu8and7.numbertodigit;

import java.util.ArrayList;
import java.util.List;

public class NumberToDigit {

    public String[] createArrayOfTiers(int num) {
        String number = String.valueOf(num);
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i <= number.length() - 1; i++) {
            String substring = number.substring(0, i + 1);
            numbers.add(numbers.size(), substring);
        }
        return numbers.toArray(String[]::new);
    }
}
