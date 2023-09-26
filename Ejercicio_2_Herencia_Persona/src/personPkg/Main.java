package personPkg;
public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Camilo", "123 Main");

        // Create a Student object
        Student student = new Student("Daniel Caicedo", "456 Main St", "Computer Science", 2023, 5000);

        // Create a Staff object
        Staff staff = new Staff("Diego Cabrera", "789 Oak St", "Universidad Cooperativa", 45000);

        // Print information using toString method
        System.out.println("Person Information:");
        System.out.println(person);

        System.out.println("\nStudent Information:");
        System.out.println(student);

        System.out.println("\nStaff Information:");
        System.out.println(staff);
    }
}
