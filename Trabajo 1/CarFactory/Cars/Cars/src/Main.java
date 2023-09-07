public class Main {
    public static void main(String[] args) {
        // Create a CarFactory with specific chassis, tire, and car color parameters
        BusinessCarFactory factory = new CarFactory("aluminum", 1500, "Pirelli", 21, "Red");

        Car car = factory.createCar();

        // Use the created car and display its attributes
        System.out.println("Chassis: " + car.getChassis());
        System.out.println("Tire: " + car.getTire());
        System.out.println("Car Color: " + car.getCarColor());
    }
}
