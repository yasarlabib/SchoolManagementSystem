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

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }
}
