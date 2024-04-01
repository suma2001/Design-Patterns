package FactoryPattern;

public class ShapeFactory {
    
    Shape getShape(String shapeName) {
        switch(shapeName) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
