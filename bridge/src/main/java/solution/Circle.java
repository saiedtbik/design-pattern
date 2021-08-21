package solution;

public  class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        super.getColor().applyColor();
    }

    @Override
    public void draw() {
    }
}
