package com.study.patterns.iterator;

public class DinnerMenu {
    private String[] menuItems = new String[5];

    DinnerMenu() {
        menuItems[0] = "A";
        menuItems[1] = "B";
        menuItems[2] = "C";
        menuItems[3] = "D";
        menuItems[4] = "E";
    }


    public String[] getMenuItems() {
        return menuItems;
    }

    Iterator<String> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

}
