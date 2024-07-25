package me.dora.katas.kyu8and7.consecutivepairs;

public class ConsecutivePairs {
    public int solve(int[] numbers) {
        int counter = 0;
        int length = numbers.length;
        int limit = length % 2 != 0 ? length - 2 : length - 1;
        for (int index = 0; index <= limit; index += 2) {
            int current = numbers[index];
            int next = numbers[index + 1];
            if (isConsecutive(current, next)) {
                counter++;
            }
        }
        return counter;
    }

    private boolean isConsecutive(int current, int next) {
        return next == current + 1 || next == current - 1;
    }
}
