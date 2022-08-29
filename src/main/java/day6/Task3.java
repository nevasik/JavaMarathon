package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Alex");
        Student student2 = new Student("Dima");

        Teacher teacher = new Teacher("Maria Ivanovna", "Informatics");
        Teacher teacher2 = new Teacher("Luy Alenovish", "Programming in Python");

        teacher.evaluate(student);
        teacher2.evaluate(student2);
    }
}
