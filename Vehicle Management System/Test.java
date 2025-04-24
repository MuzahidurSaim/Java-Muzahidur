public class Test {
    public static void main(String[] args) {
        
        // test a Car Object
        Car car = new Car("Honda", "Civic", "Petrol", 14.0, 280.0);
        System.out.println("Car mileage: " + car.calculateMileage());
        car.refuel(15.0);
        
        // test a Motorcycle Object
        Motorcycle motorcycle = new Motorcycle("Yamaha", "FZ", "Petrol", 20.0, 200.0);
        System.out.println("Motorcycle mileage: " + motorcycle.calculateMileage());
        motorcycle.refuel(8.0);
    }
}
