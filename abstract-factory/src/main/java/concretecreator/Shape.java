package concretecreator;

public interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}