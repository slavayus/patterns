package com.study.patterns.templatemethod;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();
        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}
