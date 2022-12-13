import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int id;
    List<Double> grade;
    int course;

    public Student(String name, int id, List<Double> grade, int course) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.course = course;
    }

    @Override
    public String toString() {
        return id + ": " + name + " " + course + " ";
    }

    public void printGrades() {
        grade.stream().forEach(n -> System.out.print(String.format("%.2f", n) + " "));
    }

    public boolean isStudentWithBadGrade() {
        return (grade.stream().filter(n -> n < 3).count() > 0);
    }

    public static void printStudentsWithGrades(List<Student> students) {
        for (Student stu: students) {
            if (!stu.isStudentWithBadGrade()) {
                System.out.print(stu);
                stu.printGrades();
                System.out.println();
            }
        }
    }
}
