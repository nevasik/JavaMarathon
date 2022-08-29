package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("");
        long start = System.currentTimeMillis();
        String number = "";

        for (int i = 0; i < 20_001; i++) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder);
        long end = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (end - start));


    }
}
