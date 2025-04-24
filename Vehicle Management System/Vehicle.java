public abstract class Vehicle implements Refuelable {
    
    // declare the data members 
    private String brand, model, fuelType;
    
    // declare the constructor
    public Vehicle(String brand, String model, String fuelType) {
        setBrand(brand);
        setModel(model);
        setFuelType(fuelType);
    }
    
    // declare the setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    // declare the getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getFuelType() {
        return fuelType;
    }
    
    // declare the abstract method
    public abstract double calculateMileage();
}
