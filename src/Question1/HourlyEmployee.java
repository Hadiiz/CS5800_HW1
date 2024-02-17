package Question1;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;


    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    //Getters
    public double getWage(){
        return wage;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }

    //Setters
    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
