package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Dima", "14-IS");
        Teacher teacher = new Teacher("Maria Ivanovna", "Informatics");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
