package me.dora.katas.kyu8and7.histogram;

import java.util.Arrays;

public class Histogram {
    public String histogram(final int[] values) {
        int sum = Arrays.stream(values).sum();
        String result = "";
        int counter = 6;
        if (sum > 100) {
            return "Number of rolls too high";
        }
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] > 0) {
                result += counter + "|" + "#".repeat(values[i]) + " " + values[i] + "\n";
            } else {
                result += counter + "|" + "\n";
            }
            counter--;
        }
        return result;
    }
}
