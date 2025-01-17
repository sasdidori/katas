package me.dora.katas.kyu8and7.countbyx;

import java.util.ArrayList;

public class Count {
    public int[] countBy(int number1, int number2) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= number2; i++) {
            int number = number1 * i;
            array.add(number);
        }
        return array.stream()
                .mapToInt(arr -> arr).toArray();
    }
}
