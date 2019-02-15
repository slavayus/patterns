package com.study.patterns.iterator;

public class Main {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        Iterator<String> iterator = dinnerMenu.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
