package com.epam.onboarding.practise.design_patterns.abstract_factory;

import com.epam.onboarding.practise.design_patterns.factory.Circle;
import com.epam.onboarding.practise.design_patterns.factory.Rectangle;
import com.epam.onboarding.practise.design_patterns.factory.Shape;
import com.epam.onboarding.practise.design_patterns.factory.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null)
            return null;
        if (shape.equalsIgnoreCase("Circle"))
            return new Circle();
        else if (shape.equalsIgnoreCase("Square"))
            return new Square();
        else if (shape.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        return null;
    }
}
