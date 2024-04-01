package FactoryPattern;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("RECTANGLE");
        shape.draw();
    }
    
}
