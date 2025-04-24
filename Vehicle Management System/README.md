# Vehicle Management System

Refuelable

    void refuel (double amount);

Vehicle implements Refuelable

    private String brand, model, fuelType;
    public constructor() {}
    public setters() {}
    public getters() {}
    public abstract double calculateMileage();

Car extends Vehicle

    private double fuelSpend, distance;
    public constructor() {}
    public setters() {}
    public getters() {}
    public double calculateMileage() {}
    public void refuel() {}

Motorcycle extends Vehicle

    private double fuelSpend, distance;
    public constructor() {}
    public setters() {}
    public getters() {}
    public double calculateMileage() {}
    public void refuel() {}
