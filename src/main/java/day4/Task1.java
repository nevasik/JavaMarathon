package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int [] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.print(Arrays.toString(array));
        System.out.println();

        System.out.println("Длина массива: " + array.length);

        int counter = 0;
        for (int i : array) {
            if (i > 8) {
                counter++;
            }
        }
        System.out.println("Количество чисел больше 8: " + counter);

        int counter1 = 0;
        for (int i : array) {
            if (i == 1) {
                counter1++;
            }
        }
        System.out.println("Количество чисел равных 1: " + counter1);

        int even = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                even++;
            }
        }
        System.out.println("Количество чётных чисел: " + even);

        int odd = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Количество нечетных чисел: " + odd);

        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
