package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) { // идём до тех пор, пока scanner видит след. строку
                String line = scanner.nextLine();
                list.add(line);

                String[] person = line.split(" "); // сплитимся между аргументами одной строки

                int age = Integer.parseInt(person[1]); // вставляем второй аргумент строки, а именно возраст

                if (age < 0) {
                        list.clear();
                        throw new IllegalArgumentException();
                    }
                }
            } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return list;
    }
}
