package lesson6.hw.task1_figure;

public class Triangle extends Figure {

    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double high;
    private double base;

    public Triangle(double sideOne, double sideTwo, double sideThree, double high, double base) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.high = high;
        this.base = base;
    }

    @Override
    public void countFigureArea() {
        System.out.println("Triangle area is: '" + (0.5 * high * base) + "'");
    }

    @Override
    public void countPerimeter() {
        System.out.println("Triangle perimeter is: '" + (sideOne + sideTwo + sideThree) + "'");
    }
}