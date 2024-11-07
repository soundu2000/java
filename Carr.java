class Carr extends VehicLe {
    int doors;

    public Carr(String make, String model, int year, int doors) {
        super(make, model, year); 
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("Starting the carr... Vroom Vroom!");
    }
}