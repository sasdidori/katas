package me.dora.katas.kyu8and7.splitstrings;

public class Split {
    String[] split(String input) {
        if (input.isEmpty()) {
            return new String[]{};
        }
        boolean isOddOrEven = input.length() % 2 == 0;
        String[] pairs = input.split("(?<=\\G.{" + 2 + "})");
        if (!isOddOrEven) {
            pairs[pairs.length - 1] = pairs[pairs.length - 1].concat("_");
        }
        return pairs;
    }
}
