package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int gradeNumber = random.nextInt(4) + 2;
        String grade;
        if (gradeNumber == 2) {
            grade = "Неудовлетворительно";
        }
        else if (gradeNumber == 3) {
            grade = "Удовлетворительно";
        }
        else if (gradeNumber == 4) {
            grade = "Хорошо";
        }
        else {
            grade = "Отлично";
        }

        System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() +
                " по предмету " + getObject() + " на оценку " + grade);
    }
}
