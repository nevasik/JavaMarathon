package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");

        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine(); // будет выполняться до тех пор, пока присутствуют строки
            String[] numbers = line.split(" "); // чем разделяются наши строки/числа между собой

            if (numbers.length != 10) {
                throw new IllegalArgumentException(); // выбрасываем исключение
            }

            int sum = 0;

            for (String number : numbers) {
                sum += Integer.parseInt(number); // переводим из строки в число с помощью Integer.parseInt
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException exception) {
            exception.printStackTrace();
            System.out.println("Некорректный входной файл");
        }
    }
}
