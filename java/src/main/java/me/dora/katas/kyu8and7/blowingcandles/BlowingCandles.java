package me.dora.katas.kyu8and7.blowingcandles;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class BlowingCandles {
    public int blowCandles(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int counter = 0;
        List<Integer> candles = Arrays.stream(str.split(""))
                .toList()
                .stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .toList();
        List<Integer> candlesWithoutInitialZeros;
        while (!candles.isEmpty()) {
            candlesWithoutInitialZeros = candles.stream()
                    .dropWhile(candle -> candle <= 0)
                    .toList();
            List<Integer> head = candlesWithoutInitialZeros.stream()
                    .limit(3)
                    .map(number -> number - 1)
                    .toList();
            List<Integer> tail = candlesWithoutInitialZeros.stream()
                    .skip(head.size())
                    .toList();
            candles = Stream.of(head, tail)
                    .flatMap(Collection::stream)
                    .dropWhile(candle -> candle <= 0)
                    .toList();
            if (!head.isEmpty()) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
