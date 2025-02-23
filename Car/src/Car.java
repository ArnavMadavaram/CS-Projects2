//Arnav Madavaram
//Lab 10
//In this Lab we wrote a basic command to be able to determine a car's mileage and other data.

public class Car {
    // Instance variables to store car details
    private int Year;
    private String Model;
    private int Miles;
    private double fuelLevel;

    // Constructor to initialize the Car object with given values
    public Car(int Year, String Model, int Miles, double fuelLevel) {
        this.Year = Year;
        this.Model = Model;
        this.Miles = Miles;
        this.fuelLevel = fuelLevel;
    }

    // Getter method for retrieving the year of the car
    public int getYear() {
        return Year;
    }

    // Getter method for retrieving the model of the car
    public String getModel() {
        return Model;
    }

    // Getter method for retrieving the miles driven by the car
    public int Miles() {
        return Miles;
    }

    // Getter method for retrieving the fuel tank level of the car
    public double getFuelTankLevel() {
        return fuelLevel;
    }

    // Method to add miles to the current mileage of the car
    public void addMiles(int milesAdded) {
        Miles += milesAdded;
    }

    // Method to check if the fuel tank is empty
    public boolean isFuelTankEmpty() {
        return fuelLevel == 0;
    }

    // Method to convert miles driven to fuel tank level percentage
    public double milesToFuelLevel() {
        final double maxCapacity = 400.0;
        return (Miles / (maxCapacity)) * 100;
    }

    // Method to modify fuel tank level based on miles driven
    public void modifyFuelTankLevel(int miles) {
        if (!isFuelTankEmpty()) {
            fuelLevel -= miles;
            if (fuelLevel < 0) {
                fuelLevel = 0;
            }
        }
    }

    // Method to simulate driving the car and updating its mileage and fuel level
    public void drive(int milesDriven) {
        modifyFuelTankLevel(milesDriven);
        System.out.println("The " + Year + " " + Model + " drove " + milesDriven + " miles, for a total mileage of " + (Miles + milesDriven) + " and a fuel level of " + milesToFuelLevel() + " %");
        if (isFuelTankEmpty()) {
            System.out.println("The " + Year + " " + Model + "'s fuel tank is empty!");
        }
    }
}
