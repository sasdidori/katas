package me.dora.katas.kyu8and7.powersofi;

public class PowersOfI {
    public String pofi(int number) {
        String[] pattern = {"i", "-1", "-i", "1"};
        int element = (number % 4);
        System.out.println();
        return element == 0 ? "1" : pattern[element - 1];
    }
}
