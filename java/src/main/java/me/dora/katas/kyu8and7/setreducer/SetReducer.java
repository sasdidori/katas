package me.dora.katas.kyu8and7.setreducer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetReducer {
    public int setReducer(int[] input) {
        int[] newInput = Arrays.copyOf(input, input.length);
        List<Integer> numbers = Arrays.stream(newInput).boxed().toList();
        while (numbers.size() > 1) {
            List<Integer> newNumbers = new ArrayList<>();
            int counter = 1;
            for (int i = 1; i <= numbers.size() - 1; i++) {
                Integer current = numbers.get(i);
                Integer previous = numbers.get(i - 1);
                if (current.equals(previous)) {
                    counter++;
                } else {
                    newNumbers.add(counter);
                    counter = 1;
                }
            }
            newNumbers.add(counter);
            numbers = newNumbers;
        }
        return numbers.get(0);
    }
}
