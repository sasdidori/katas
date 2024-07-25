package me.dora.katas.kyu8and7.inspiringstrings;

public class InspiringStrings {
    public String longestWord(String word) {
        String[] words = word.split("\\s+");
        String longestWord = words[0];
        for (int i = 1; i <= words.length - 1; i++) {
            if (words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }
}
