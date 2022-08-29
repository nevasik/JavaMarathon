package day8;

public class Task2 {
    public static void main(String[] args) {
        Airplane boeng = new Airplane("Boeng", 2022, 18, 900);
        boeng.fullUp(50);
        System.out.println(boeng);
    }
}
