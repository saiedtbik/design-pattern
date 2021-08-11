package solution;

public class Solution {

    public static void main(String[] args) {

        Blue blue = new Blue();
        Green green = new Green();

        Circle blueCircle = new Circle(blue);
        blueCircle.applyColor();
        Circle greenCircle = new Circle(green);
        greenCircle.applyColor();

        Square blueSquare = new Square(blue);
        blueSquare.applyColor();
        Square greenSquare = new Square(green);
        greenSquare.applyColor();

    }

}
