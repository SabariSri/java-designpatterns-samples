package com.epam.onboarding.practise.design_patterns.factory;

public class ShapeFactory {
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
