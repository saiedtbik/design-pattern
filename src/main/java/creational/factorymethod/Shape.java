package creational.factorymethod;

public interface Shape {
    void draw();
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Draw Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Draw Square");
    }
}