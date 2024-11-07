class VehicLe {
    String make;
    String model;
    int year;

    
    public VehicLe(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    
    public void start() {
        System.out.println("Starting the vehicLe...");
    }

   
    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}


