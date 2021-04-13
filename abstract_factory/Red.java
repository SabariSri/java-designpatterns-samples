package com.epam.onboarding.practise.design_patterns.abstract_factory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red Class::fill() method");
    }
}
