package me.dora.katas.kyu8and7.catsandshelves;

public class CatsAndShelves {
    public int solution(int start, int finish) {
        int shelves = finish - start;
        int stepsWithLength3 = shelves / 3;
        int stepsWithLength1 = shelves % 3;
        return stepsWithLength1 + stepsWithLength3;
    }
}
