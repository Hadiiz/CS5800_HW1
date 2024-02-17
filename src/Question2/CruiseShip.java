package Question2;

public class CruiseShip extends Ship{

    private int maxPassengers;
    public CruiseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }

    //Getters
    public int getMaxPassengers(){
        return maxPassengers;
    }
    //Setters
    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }

    //Print
    @Override
    public void print() {
        System.out.println("Ship Name: "+getName()+"\t\tMax Passengers: "+maxPassengers);
    }
}
