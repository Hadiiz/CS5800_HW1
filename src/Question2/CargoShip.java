package Question2;

public class CargoShip extends Ship{
    private int cargoCapacity;
    public CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }

    //Getters
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    //Setters
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    //Print

    @Override
    public void print() {
        System.out.println("Ship Name: "+getName()+"\t\tCargo Capacity: "+cargoCapacity);
    }
}
