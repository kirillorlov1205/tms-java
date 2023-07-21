package lesson6_abstract_interfaces.hw.task1_figure;

public class Circle implements Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void countFigureArea() {
        System.out.println("Circle area is: '" + (3.14 * radius * radius) + "'");
    }

    @Override
    public void countPerimeter() {
        System.out.println("Circle perimeter is: '" + (2 * 3.14 * radius) + "'");
    }
}