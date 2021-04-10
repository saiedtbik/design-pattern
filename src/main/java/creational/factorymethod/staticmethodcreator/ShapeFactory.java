package creational.factorymethod.staticmethodcreator;

public class ShapeFactory {
    public static Shape getShape(ShapeType type) {
        Shape shape = null;
        if (type == null) {
            return null;
        }
        switch (type) {
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                shape = new Rectangle();
        }
        return shape;
    }
}
