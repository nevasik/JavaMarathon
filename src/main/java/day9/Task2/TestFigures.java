package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Restangle("Red", 5, 10),
                new Restangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };
        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumPerimetr = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                 sumPerimetr += figure.perimeter();
            }
        }
        return sumPerimetr;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumArea = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sumArea += figure.area();
            }
        }
        return sumArea;
    }
}
