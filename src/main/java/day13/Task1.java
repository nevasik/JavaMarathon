package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Dima");
        User user2 = new User("Alex");
        User user3 = new User("Lux");

        user1.sendMessage(user2, "Привет " + user2.username + " !");
        user1.sendMessage(user2, "Как твои дела?");

        user2.sendMessage(user1, "Салют " + user1.username + " !");
        user2.sendMessage(user1, "Мои дела идут по маслу, недавно закончил курс по Java Core!");
        user2.sendMessage(user1, "Твои как " + user1.username + " ?");

        user3.sendMessage(user1, "Извини за беспокойство " + user1.username + " не дашь материалов по изучении SQL");
        user3.sendMessage(user1, "А то я не могу никак найти, а " + user2.username + " уже далеко ушёл от меня, и почти закончил учить SQL");
        user3.sendMessage(user1, "Можешь мне помочь, если тебе не трудно?");

        user1.sendMessage(user3,"Хай " + user2.username + "!");
        user1.sendMessage(user3, "Почему тебе не терпится написать мне завтра утром, эх... ладно " + user2.username + " помогу тебе");
        user1.sendMessage(user3, "Отправляю тебе ссылку на изучении материала: http.Languages SQL");

        user3.sendMessage(user1, "Спасибо " + user1.username + " ты меня очень выручил! Доброй ночи.");

        MessageDatabase.showDialog(user1, user3);
    }
}
