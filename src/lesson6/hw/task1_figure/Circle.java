package lesson6.hw.task1_figure;

public class Circle extends Figure {

    private double radius;

    @Override
    public void countFigureArea(double base, double high) {

    }

    @Override
    public void countPerimeter() {
        System.out.println("Circle perimeter is: '" + radius * 3.14 * radius + "'");
    }
}
