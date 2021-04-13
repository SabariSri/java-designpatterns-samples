package com.epam.onboarding.practise.design_patterns.factory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside circle class::draw() method");
    }
}
