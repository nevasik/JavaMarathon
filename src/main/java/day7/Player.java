package day7;

public class Player {
    private int stamina; // инизилизируется через конструктор
    private final static int MAX_STAMINA = 100; // со значением 100
    private final static int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;

        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    public static void info() {
        int player = 6 - countPlayers;
        String grammatics;

        if (player == 1) {
            grammatics = "свободное место";
        } else if (player == 2 || player == 3 || player == 4) {
            grammatics = "свободных места";
        }
        else {
            grammatics = "свободных мест";
        }

        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле ещё есть " + player + " " + grammatics);
        }
        else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
