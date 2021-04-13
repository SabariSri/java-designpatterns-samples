package com.epam.onboarding.practise.design_patterns.abstract_factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Color"))
            return new ColorFactory();
        else if (choice.equalsIgnoreCase("Shape"))
            return new ShapeFactory();
        return null;
    }
}
