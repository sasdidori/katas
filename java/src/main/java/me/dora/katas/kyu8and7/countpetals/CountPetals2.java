package me.dora.katas.kyu8and7.countpetals;

public class CountPetals2 {
    private final String[] sentences = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
    public String howMuchILoveYou(int petals) {
        int position = sentences.length - 1;
        while (petals > 0) {
            petals--;
            position = (position + 1) % sentences.length;
        }
        return sentences[position];
    }
}
