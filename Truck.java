class Truck extends VehicLe {
    int cargoCapacity;

   
    public Truck(String make, String model, int year, int cargoCapacity) {
        super(make, model, year);  
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start() {
        System.out.println("Starting the truck... Rumble Rumble!");
    }
}
