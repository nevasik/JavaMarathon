package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Reno", 2021, 15, 1000);
        airplane.setYear(2022);
        airplane.setLength(20);

        airplane.fullUp(300);
        airplane.fullUp(200);
        airplane.info();
    }
}
