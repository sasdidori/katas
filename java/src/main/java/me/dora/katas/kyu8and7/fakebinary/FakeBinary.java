package me.dora.katas.kyu8and7.fakebinary;

public class FakeBinary {
    public String fakeBin(String numberString) {
        return numberString
                .replaceAll("4", "0")
                .replaceAll("3", "0")
                .replaceAll("2", "0")
                .replaceAll("1", "0")
                .replaceAll("5", "1")
                .replaceAll("6", "1")
                .replaceAll("7", "1")
                .replaceAll("8", "1")
                .replaceAll("9", "1");
    }
}

