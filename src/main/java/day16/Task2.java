package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();

        File file1 = new File("file1.txt");
        PrintWriter printWriter = new PrintWriter(file1);

        for (int i = 0; i < 1000; i++) {
            printWriter.println(random.nextInt(100));
        }
        printWriter.close();
        Scanner scanner = new Scanner(file1);

        File file2 = new File("file2.txt");
        PrintWriter printWriter2 = new PrintWriter(file2);

        int counter = 0;
        int sum = 0;

        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter == 20) {
                printWriter2.println((double) sum / counter);

                counter = 0;
                sum = 0;
            }
        }
        printWriter2.close();

        printResult(file2);
    }
    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);

            double result = 0;
            while (scanner.hasNextLine()) {
                result += Double.parseDouble(scanner.nextLine());
            }
            System.out.println((int) result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
