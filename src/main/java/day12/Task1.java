package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String>list = new ArrayList();
        list.add("бмв");
        list.add("лексус");
        list.add("мерседес");
        list.add("киа");
        list.add("опель");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();

        list.add(2, "мазератти");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();

        list.remove(0);
        for (String s : list) {
            System.out.println(s);
        }

    }
}
