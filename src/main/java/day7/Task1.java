package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Global", 2020, 100, 780);
        Airplane airplane2 = new Airplane("Boeng", 2021, 27, 114);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}