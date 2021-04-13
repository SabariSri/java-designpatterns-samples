package com.epam.onboarding.practise.design_patterns.abstract_factory;

import com.epam.onboarding.practise.design_patterns.factory.Shape;

public abstract class AbstractFactory {
    abstract Color getColor (String color);
    abstract Shape getShape (String shape);
}
