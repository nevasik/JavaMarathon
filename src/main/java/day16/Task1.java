package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("/home/nevasik/Рабочий стол/JavaMarathon2021/src/main/resources/Integers");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split(" ");

                int number = 0;
                double result = 0;
                for (String s : split) {
                    number += Integer.parseInt(s);
                }
                result = (double) number / split.length;

                String formattedDouble = String.format("%.3f", result);

                System.out.print(result + " --> " + formattedDouble);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

