package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("/home/nevasik/Рабочий стол/JavaMarathon2021/src/main/resources/shoes.csv");
        File file2 = new File("/home/nevasik/Рабочий стол/JavaMarathon2021/src/main/resources/missing_shoes.txt");
        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(file2);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();


                String[] split = line.split(";");

                int leftovers = Integer.parseInt(split[2]);

                if (leftovers == 0) {
                    pw.println(line);
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
