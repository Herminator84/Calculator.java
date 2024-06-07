public class Car {
    private String brand;
    private String registrationNumber;
    private int maxSpeed;
    private String ownerName;
    private String fuelType;

    // Constructor
    public Car(String brand, String registrationNumber, int maxSpeed, String ownerName, String fuelType) {
        this.brand = brand;
        this.registrationNumber = registrationNumber;
        this.maxSpeed = maxSpeed;
        this.ownerName = ownerName;
        this.fuelType = fuelType;
    }

    // Getter methods (you can add setters if needed)
    public String getBrand() {
        return brand;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public static void main(String[] args) {
        // Instantiate an object of the Car class
        Car myCar = new Car("Toyota", "ABC123", 180, "Herman E", "Gasoline");

        // Print sample information
        System.out.println("Car brand: " + myCar.getBrand());
        System.out.println("Registration number: " + myCar.getRegistrationNumber());
        System.out.println("Max speed: " + myCar.getMaxSpeed() + " km/h");
        System.out.println("Owner name: " + myCar.getOwnerName());
        System.out.println("Fuel type: " + myCar.getFuelType());
    }
}

public class Main {
    public static void main(String[] args) {
        // Assign a value to the score
        int score = 72;

        // Check the score using if statements
        if (score >= 65) {
            System.out.println("Hurray, You passed!");
        } else if (score >= 55 && score <= 64) {
            System.out.println("You are almost there");
        } else {
            System.out.println("Sorry, you did not pass");
        }
    }
}
