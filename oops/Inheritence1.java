class Car {
    String color;
    String model;
    String brand;
    int mileage;
    int no_of_gears;

    Car(String color, String model, String brand, int mileage, int no_of_gears) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.no_of_gears = no_of_gears;
    }

    void applyBrake() {
        System.out.println("Braking");
    }

    void applySpeed() {
        System.out.println("Speed....");
    }

    void shiftGear() {
        System.out.println("Shifting Gear....");
    }
}

// Child class
class Verna extends Car {

    int capacity;

    // Constructor of child class
    Verna(String color, String model, String brand, int mileage, int no_of_gears, int capacity) {
        super(color, model, brand, mileage, no_of_gears); // calling parent constructor
        this.capacity = capacity;
    }

    void airbags() {
        System.out.println("Airbags...");
    }
}

// Main class
public class Inheritence1 {
    public static void main(String[] args) {

        Verna v = new Verna("Black", "Second TOP", "HYUNDAI", 15, 6, 5);

        v.applyBrake();
        v.applySpeed();
        v.shiftGear();
        v.airbags();
    }
}