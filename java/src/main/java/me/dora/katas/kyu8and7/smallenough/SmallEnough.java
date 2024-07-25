package me.dora.katas.kyu8and7.smallenough;

public class SmallEnough {
    public boolean smallEnoughMethod(int[] a, int limit) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > limit) {
                return false;
            }
        }
        return true;
    }
}
