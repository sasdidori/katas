package me.dora.katas.kyu8and7.listfiltering;

import java.util.List;

public class ListFiltering {
    public List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(element -> element instanceof Integer)
                .toList();
    }
}

