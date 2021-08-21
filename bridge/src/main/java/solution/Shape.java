package solution;

public abstract class Shape {
    private Color color;
    public Color getColor() {
        return color;
    }

    public Shape(Color color) {
        this.color = color;
    }

    abstract void applyColor();
    abstract void draw();
}
