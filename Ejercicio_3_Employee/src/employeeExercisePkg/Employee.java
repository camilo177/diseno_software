package employeeExercisePkg;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(){
        //Constructor
    }
    //Methods
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary*12;
    }

    public int raiseSalary(int percent){
        return salary + ((salary * percent)/100);
    }

    public String toString(){
        return "ID: " + getId() + ", Name: " + getName() + ", Salary: " + getSalary();
    }

}