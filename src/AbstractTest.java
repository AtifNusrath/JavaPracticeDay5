
interface Demo1 {
    void changeName(String name);

}

abstract class Person implements Demo1 {

    String name;
    String gender;

    public Person(String nm, String gen){
        this.name=nm;
        this.gender=gen;
    }

    public abstract void work();

    @Override
    public String toString(){
        return "Name="+this.name+" ::Gender="+this.gender;
    }

    public void changeName(String newName) {
        this.name = newName;
    }
}

class Employee extends Person {

    private int empId;

    public Employee(String nm, String gen, int id) {
        super(nm, gen);
        this.empId = id;
    }

    @Override
    public void work() {
        if (empId == 0) {
            System.out.println(name + "is Student Not working");
        } else {
            System.out.println("Working as employee!!");
        }
    }
}
public class AbstractTest {

    public static void main(String args[]){

        Person student = new Employee("Dove","Female",0);
        Person employee = new Employee("Pankaj","Male",123);
        student.work();
        employee.work();

        employee.changeName("Pankaj Kumar");
        System.out.println(employee.toString());
    }
}

