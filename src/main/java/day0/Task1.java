package day0;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            System.out.println(random.nextInt(11) + 90);
        }
    }
}