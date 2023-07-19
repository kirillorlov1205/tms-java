package lesson6.hw.task1_figure;

public class Square extends Figure {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void countFigureArea() {
        System.out.println("Square area is: '" + (sideLength * sideLength) + "'");
    }

    @Override
    public void countPerimeter() {
        System.out.println("Square perimeter is: '" + (sideLength * 4) + "'");
    }
}
