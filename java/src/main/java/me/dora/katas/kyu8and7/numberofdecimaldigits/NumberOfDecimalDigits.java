package me.dora.katas.kyu8and7.numberofdecimaldigits;

public class NumberOfDecimalDigits {
    public int digits(long n) {
        String numberAsString = Long.toString(n);
        int counter = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            counter++;
        }
        return counter;
    }
}
