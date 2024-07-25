package me.dora.katas.kyu8and7.countpositivessumnegatives;

import java.util.ArrayList;

public class CountPositivesSumNegatives {
    public int[] countPositivesSumNegatives(int[] input) {
        int countOfPositives = 0;
        int sumOfNegatives = 0;
        for (int k : input) {
            if (k > 0) {
                countOfPositives++;
            } else {
                sumOfNegatives += k;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(countOfPositives);
        list.add(sumOfNegatives);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
