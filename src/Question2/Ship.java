package Question2;

public class Ship {
    private String name;
    private String year;
    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    //Getters
    public String getName(){
        return name;
    }
    public String getYear(){
        return year;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setYear(String year){
        this.year = year;
    }

    //Print
    public void print(){
        System.out.println("Ship Name: "+name+"\t\tYear Built: "+year);
    }
}
