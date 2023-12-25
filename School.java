/*
The school can have many teachers and students
Implements teachers and students using an ArrayList
*/

import java.util.*;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    // constructor for the School class
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    // returns the list of the teachers in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // returns the list of the student in the school
    public List<Student> getStudents() {
        return students;
    }

    // returns the total money earned by the school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // returns the total money spent by the school
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // adds a teacher to the school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // adds a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // adds the total money earned by the school
    public void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned = moneyEarned;
    }

    // updates the money spent by the school, which is the salary given to teachers
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

}
