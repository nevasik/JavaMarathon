package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Фараон");
        members1.add("Лил кристалл");
        members1.add("Буда");
        members1.add("Майот");
        members1.add("Сода лав");
        members1.add("Бустер");

        MusicBand band1 = new MusicBand("Reper Russian", 2022, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Би-2");
        members2.add("Ольга Бузова");
        members2.add("Дима Билан");
        members2.add("Карнавал");
        members2.add("Егор Крид");
        members2.add("Тимати");

        MusicBand band2 = new MusicBand("Musician Russian", 2020, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
