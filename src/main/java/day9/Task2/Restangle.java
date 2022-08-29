package day9.Task2;

public class Restangle extends Figure {
    private double weight;
    private double height;

    public Restangle(String color, double weight, double height) {
        super(color);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double area() {
        return weight * height;
    }

    @Override
    public double perimeter() {
        return 2 * (weight + height);
    }
}
