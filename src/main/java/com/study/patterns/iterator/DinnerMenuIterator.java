package com.study.patterns.iterator;

public class DinnerMenuIterator implements Iterator<String> {
    private String[] menuItems;
    private int position = 0;

    public DinnerMenuIterator(String[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.length > position && menuItems[position] != null;
    }

    @Override
    public String next() {
        return menuItems[position++];
    }
}
