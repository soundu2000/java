public class Main {
    public static void main(String[] args) {
        
        VehicLe carr = new Carr("Toyota", "Camry", 2022, 4);
        VehicLe bike1 = new Bike1("Yamaha", "YZF", 2021, "Yes");
        VehicLe truck = new Truck("Ford", "F-150", 2023, 10000);

        
        System.out.println("Testing polymorphism with start() method:");
        carr.start();   
        bike1.start();  
        truck.start(); 

       
        System.out.println("\nDisplaying details of the vehicLes:");
        carr.displayDetails();
        bike1.displayDetails();
        truck.displayDetails();
    }
}