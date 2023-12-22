/*
    Keeps track of student's name, id, grade, tuition, and tuition paid.
*/
public class Student {
    private int id;
    private String name;
    private int grade;
    private int tuitionPaid;
    private int tuitionTotal;

    // constructor for the student class
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.tuitionTotal = 30000;
        this.tuitionPaid = 0;
    }

    // not going to alter the student's name or ID

    public void setGrade(int grade){
        this.grade = grade;
    }
}


