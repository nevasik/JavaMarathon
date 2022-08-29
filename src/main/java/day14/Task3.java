package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File fIle = new File("people.txt");

        System.out.println(parseFileToObjList(fIle));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");

                list.add(new Person(person[0], Integer.parseInt(person[1])));

                int age = Integer.parseInt(person[1]);

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
