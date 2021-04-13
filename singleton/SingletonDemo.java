package com.epam.onboarding.practise.design_patterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject object = SingletonObject.getInstance3();
        object.printMessage();
    }
}
