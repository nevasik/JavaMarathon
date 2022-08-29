package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Honda");
        car.setColor("Green");
        car.setYear(2022);

        Motorbike motorbike = new Motorbike("Mercedes", "Orange", 2020);

        car.info();
        System.out.println(car.yearDifference(3000));

        motorbike.info();
        System.out.println(motorbike.yearDifference(5000));
    }
}
