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

        // students paying tuition
        von.payTuition(5000);
        rakesh.payTuition(3000);

        // money earned by the school so far
        System.out.println("RHS has earned $" + rhs.getTotalMoneyEarned());

        // paying teachers their salary
        System.out.println("-----MAKING SCHOOL PAY TEACHER SALARY-----");
        gigi.receiveSalary(gigi.getSalary());
        System.out.println("RHS has paid salary to " + gigi.getName() + " and now has $" + rhs.getTotalMoneyEarned());

        bob.receiveSalary(bob.getSalary());
        System.out.println("RHS has paid salary to " + bob.getName() + " and now has $" + rhs.getTotalMoneyEarned());

        // printing out information about objects
        System.out.println(von);
        System.out.println(jane);
    }
}