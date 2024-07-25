package me.dora.katas.kyu8and7.smallestinarray;

public class SmallestInArray {
    public int findSmallestInt(int[] args) {
        int smallestNumber = args[0];
        for (int arg : args) {
            if (arg < smallestNumber) {
                smallestNumber = arg;
            }
        }
        return smallestNumber;
    }
}
