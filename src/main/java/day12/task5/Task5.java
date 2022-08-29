package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Фараон", 24));
        members1.add(new MusicArtist("Сода лав", 22));
        members1.add(new MusicArtist("Буда", 23));
        members1.add(new MusicArtist("Бустер", 21));
        members1.add(new MusicArtist("Лил кристалл", 22));

        MusicBand musicBand = new MusicBand("Russian Reper", 2022, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Дима Билан", 25));
        members2.add(new MusicArtist("Ольга Бузова", 24));
        members2.add(new MusicArtist("Валя Карнавал", 22));
        members2.add(new MusicArtist("Григорий Лепс", 55));
        members2.add(new MusicArtist("Егор Шип", 20));


        MusicBand musicBand2 = new MusicBand("Russian Artist", 2019, members2);

        musicBand.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand2, musicBand);

        musicBand.printMembers();
        musicBand2.printMembers();
    }
}
