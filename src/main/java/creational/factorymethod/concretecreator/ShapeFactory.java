package creational.factorymethod.concretecreator;

public class ShapeFactory {
    public Shape getShape(ShapeType type) {
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
