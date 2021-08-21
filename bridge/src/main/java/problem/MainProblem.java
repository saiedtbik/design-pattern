package problem;

public class MainProblem {
    public static void main(String[] args) {
        Circle blueCircle = new BlueCircle();
        blueCircle.applyColor();
        Circle greenCircle = new GreenCircle();
        greenCircle.applyColor();


        Square blueSquare = new BlueSquare();
        blueSquare.applyColor();
        Square greenSquare = new GreenSquare();
        greenSquare.applyColor();
    }
}
