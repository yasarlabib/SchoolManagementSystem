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

    // mutator for grade
    public void setGrade(int grade){
        this.grade = grade;
    }

    // add the tuition to the tuitionPaid when the school receives the funds
    public void payTuition(int tuition){
        tuitionPaid += tuition;
        School.updateTotalMoneyEarned(tuitionPaid);
    }

    // return the id of the student
    public int getId() {
        return id;
    }

    // return the name of the student
    public String getName() {
        return name;
    }

    // return the grade of the student
    public int getGrade() {
        return grade;
    }

    // return the tuition paid by the student
    public int getTuitionPaid() {
        return tuitionPaid;
    }

    // return the total tuition for the student
    public int getTuitionTotal() {
        return tuitionTotal;
    }

    // return the remaining tuition
    public int getRemianingTuition(){
        return tuitionTotal - tuitionPaid;
    }
}


