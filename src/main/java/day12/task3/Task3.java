package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> list = Arrays.asList(
                new MusicBand("23:45", 2006),
                new MusicBand("25/17", 2002),
                new MusicBand("5sta Family", 2004),
                new MusicBand("ARIA", 1985),
                new MusicBand("CARPRICE", 1998),
                new MusicBand("Gorky Park", 1987),
                new MusicBand("PPK", 1998),
                new MusicBand("PROPAGANDA", 2001),
                new MusicBand("Reflex", 1999),
                new MusicBand("Serebro", 2006),
                new MusicBand("YIN AND YAN", 2007),
                new MusicBand("Би-2", 1988)
        );

        for (MusicBand musicBand : list) {
            System.out.print(musicBand + " ");
        }

        System.out.println();

        List<MusicBand> groups2000 = groupsAfter2000(list);

        for (MusicBand musicBand : groups2000) {
            System.out.print(musicBand + " ");
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> after2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.year >= 2000) {
                after2000.add(band);
            }
        }
        return after2000;
    }
}
