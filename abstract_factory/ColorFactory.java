package com.epam.onboarding.practise.design_patterns.abstract_factory;

import com.epam.onboarding.practise.design_patterns.factory.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null)
            return null;
        if (color.equalsIgnoreCase("Red"))
            return new Red();
        else if (color.equalsIgnoreCase("Blue"))
            return new Blue();
        else if (color.equalsIgnoreCase("Green"))
            return new Green();
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
