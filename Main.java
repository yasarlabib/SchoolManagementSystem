import java.util.*;

public class Main {
    public static void main(String[] args) {
        // teacher objects
        Teacher gigi = new Teacher(1, "Gigi", 500);
        Teacher jane = new Teacher(2, "Jane", 700);
        Teacher bob = new Teacher(3, "Bob", 300);

        // list of teachers
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(gigi);
        teacherList.add(jane);
        teacherList.add(bob);

        // student objects
        Student von = new Student(1, "Von", 4);
        Student rakesh = new Student(2, "Rakesh", 12);
        Student robby = new Student(3, "Robby", 5);

        // list of students
        List<Student> studentList = new ArrayList<>();
        studentList.add(von);
        studentList.add(rakesh);
        studentList.add(robby);

        // creating School
        School rhs = new School(teacherList, studentList);

        von.payTuition(5000);
        rakesh.payTuition(3000);
        System.out.println("RHS has earned $" + rhs.getTotalMoneyEarned());

        System.out.println("-----Making RHS PAY TEACHER SALARY-----");
    }
}