package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

         int [] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10_000);
        }

        int maxSum = 0;
        int maxId = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxId = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxId);
    }
}
