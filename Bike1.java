class Bike1 extends VehicLe {
    String hasGear;

    
    public Bike1(String make, String model, int year, String hasGear) {
        super(make, model, year);
        this.hasGear = hasGear;
    }

    @Override
    public void start() {
        System.out.println("Starting the bike1... Zoom Zoom!");
    }
}