package com.epam.onboarding.practise.design_patterns.factory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside rectangle class::draw() method");
    }
}
