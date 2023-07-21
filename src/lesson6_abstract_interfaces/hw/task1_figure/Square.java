package lesson6_abstract_interfaces.hw.task1_figure;

public class Square implements Figure {

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