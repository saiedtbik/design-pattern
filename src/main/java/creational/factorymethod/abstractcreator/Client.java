package creational.factorymethod.abstractcreator;

public class Client {

    public static void main(String[] args) {
        Shape circle = new CircleFactory().getShape();
        circle.draw();

        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();
    }

}
