package me.dora.katas.kyu8and7.ignoreduplicates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class IgnoreDuplicates {

    public int sumNoDuplicates(int[] arr) {
        List<Integer> numbers = new ArrayList<>();
        Integer[] array = IntStream.of(arr).boxed().toArray(Integer[]::new);
        Collections.addAll(numbers, array);
        List<Integer> uniqueNumbers = new ArrayList<>();
        int sum = 0;
        if(!numbers.isEmpty()){
            for (int i = 0; i <= numbers.size() - 1; i++){
                int currentNumber = numbers.get(i);
                for (int j = i + 1; j <= numbers.size() - 1; j++){
                    if (numbers.get(j) == currentNumber){
                        numbers.remove(numbers.get(j));
                    } else {
                       // Collections.copy(uniqueNumbers,currentNumber);
                    }
                }
            }
        }
        return sum;
    }


}
