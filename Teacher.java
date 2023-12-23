// keeps track of the teacher's id, name, and salary
public class Teacher {
    private int id;
    private String name;
    private int salary;

    // constructor for the Teacher class, helps create Teacher object
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // returns the id for the current teacher
    public int getId(){
        return id;
    }

    // returns name of the teacher
    public String getName(){
        return name;
    }

    // returns the salary of the teacher
    public int getSalary(){
        return salary;
    }

    // set the salary
    public void setSalary(){
        this.salary = salary;
    }


}
