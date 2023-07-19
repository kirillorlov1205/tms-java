package lesson6.hw.task1_figure;

public class Triangle extends Figure {
    @Override
    public void countFigureArea(double base, double high) {
        System.out.println("Triangle area is: '"+ 0.5 * base * high + "'");
    }

    @Override
    public void countPerimeter() {

    }
}