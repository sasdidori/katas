package me.dora.katas.kyu8and7.sumpositives;

public class PositiveNumberCalculator {
    public int[] arr = {1, -2, 3, 4};

    public int sum(int[] arr) {
        int sumOfNumbers = 0;
        for (int j : arr) {
            if (j > 0) {
                sumOfNumbers += j;
            }
        }
        return sumOfNumbers;
    }
}
