package creational.factorymethod.staticmethodcreator;

public class Client {

    public static void main(String[] args) {

        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();

    }
}
