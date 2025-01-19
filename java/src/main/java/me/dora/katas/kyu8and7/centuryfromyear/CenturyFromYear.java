package me.dora.katas.kyu8and7.centuryfromyear;

public class CenturyFromYear {
    public int century(int number) {
        if (number <= 100) {
            return 1;
        }
        if (number % 100 == 0) {
            return number / 100;
        }
        return number / 100 + 1;
    }
}
