package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10_000);
        }

        int max = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);

        int min = 10_000;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);

        int counter = 0;
        for (int i : array) {
            if (i % 10 == 0 ) {
                counter++;
            }
        }
        System.out.println(counter);

        int sum = 0;
        for (int i : array) {
            if (i % 10 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
