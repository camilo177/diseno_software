package employeeExercisePkg;

public class EmployeeExercise {
    public EmployeeExercise(){
    }

    public static void main(String[] args) {
        Employee employeeOne = new Employee();

        employeeOne.setFirstName("Daniel");
        employeeOne.setLastName("Silva");

        System.out.println("El nombre completo es: " + employeeOne.getName());

        employeeOne.setSalary(1200000);
        System.out.println("El salario con incremento del 10% es: " + employeeOne.raiseSalary(10));

        System.out.println(employeeOne.toString());
    }
}
