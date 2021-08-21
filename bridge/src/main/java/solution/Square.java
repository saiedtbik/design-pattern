package solution;

public class Square extends Shape {

    public Square(Color color) {
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
