public class Motorcycle extends Vehicle {
    
    // declare the data members
    private double fuelSpend, distance;
    
    // declare the constructor 
    public Motorcycle(String brand, String model, String fuelType, double fuelSpend, double distance) {
        super(brand, model, fuelType);
        setFuelSpend(fuelSpend);
        setDistance(distance);
    }
    
    // declare the setters
    public void setFuelSpend(double fuelSpend) {
        this.fuelSpend = fuelSpend;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    // declare the getters
    public double getFuelSpend() {
        return fuelSpend;
    }
    public double getDistance() {
        return distance;
    }
    
    // declare the abstract method
    @Override
    public double calculateMileage() {
        return (distance / fuelSpend);
    }
    
    // declare the interface method
    @Override
    public void refuel(double amount) {
        System.out.println("Car is refueled with " + amount + " liters of " + getFuelType());
    }
}
