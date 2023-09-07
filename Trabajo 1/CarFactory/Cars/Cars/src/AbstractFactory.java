// Interface Car with all required methods
interface Car {
    String getCar();
    String getChassis();
    String getTire();
    String getCarColor();
}

class CarA implements Car {
    private final Chassis chassis;
    private final Tire tire;
    private final String carColor;

    public CarA(Chassis chassis, Tire tire, String carColor) {
        this.chassis = chassis;
        this.tire = tire;
        this.carColor = carColor;
    }

    @Override
    public String getCar() {
        return "New Car";
    }

    @Override
    public String getChassis() {
        return chassis.getChassisMaterial() + " Weight: " + chassis.getChassisWeight() ;
    }

    @Override
    public String getTire() {
        return tire.getTireType() + " Size: " + tire.getTireSize();
    }

    @Override
    public String getCarColor() {
        return carColor;
    }
}

class Chassis {
    private final String chassisMaterial;
    private final float chassisWeight;

    public Chassis(String chassisMaterial, float chassisWeight) {
        if ("aluminum".equalsIgnoreCase(chassisMaterial) || "steel".equalsIgnoreCase(chassisMaterial)) {
            this.chassisMaterial = chassisMaterial;
        } else {
            throw new IllegalArgumentException("Invalid chassis material");
        }
        this.chassisWeight = chassisWeight;
    }

    public String getChassisMaterial() {
        return chassisMaterial;
    }

    public float getChassisWeight() {
        return chassisWeight;
    }
}

class Tire {
    private final String tireType;
    private final float tireSize;

    public Tire(String tireType, float tireSize) {
        this.tireType = tireType;
        this.tireSize = tireSize;
    }

    public String getTireType() {
        return tireType;
    }

    public float getTireSize() {
        return tireSize;
    }
}

// Interface of Abstract Factory
interface BusinessCarFactory {
    Car createCar();
}

// Implementation of Abstract Factory
class CarFactory implements BusinessCarFactory {
    private final Chassis chassis;
    private final Tire tire;
    private final String carColor;

    public CarFactory(String chassisMaterial, float chassisWeight, String tireType, float tireSize, String carColor) {
        this.chassis = new Chassis(chassisMaterial, chassisWeight);
        this.tire = new Tire(tireType, tireSize);
        this.carColor = carColor;
    }

    @Override
    public Car createCar() {
        return new CarA(chassis, tire, carColor);
    }
}


//Main for creating various cars:
/*
public class Main {
    public static void main(String[] args) {
        // Create an array of factories (you can have multiple factories here)
        BusinessCarFactory[] factories = {
                new CarFactory("aluminum", 2000, "summer", 18, "Red"),
                new CarFactory("steel", 2500, "winter", 17, "Blue")
        };

        // Create 100 cars for each factory
        for (BusinessCarFactory factory : factories) {
            createAndPrintCars(factory, 100);
        }
    }

    public static void createAndPrintCars(BusinessCarFactory factory, int numberOfCars) {
        for (int i = 0; i < numberOfCars; i++) {
            Car car = factory.createCar();
            System.out.println("Car #" + (i + 1) + ":");
            System.out.println("   Car: " + car.getCar());
            System.out.println("   Chassis: " + car.getChassis());
            System.out.println("   Tire: " + car.getTire());
            System.out.println("   Car Color: " + car.getCarColor());
            System.out.println();
        }
    }
}
*/


