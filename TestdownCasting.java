class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

public class TestdownCasting {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(); 
        
        Car car = (Car) vehicle; 
        car.drive(); 
    }
}
