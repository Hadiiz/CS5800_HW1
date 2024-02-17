package Question1;
import java.text.NumberFormat;
public class Main {


    public static void main(String[] args) {
            SalariedEmployee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
            HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
            HourlyEmployee employee3 = new HourlyEmployee("Marcy", "Quinn", "333-33-3333", 19, 47);
            CommissionEmployee employee4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
            SalariedEmployee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
            BaseEmployee employee6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
            CommissionEmployee employee7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);


            System.out.printf(getOffset(0), "First name", "Last name", "Social sec #", "Weekly Salary", "Wage", "Hours Worked", "Com rate", "Gross salary", "Base salary");
            System.out.printf(getOffset(1), employee1.getFirstName(), employee1.getLastName(), employee1.getSocialSecurityNumber(), formatMoney(employee1.getWeeklySalary()));
            System.out.printf(getOffset(2), employee2.getFirstName(), employee2.getLastName(), employee2.getSocialSecurityNumber(), formatMoney(employee2.getWage()), formatHours(employee2.getHoursWorked()));
            System.out.printf(getOffset(2), employee3.getFirstName(), employee3.getLastName(), employee3.getSocialSecurityNumber(), formatMoney(employee3.getWage()), formatHours(employee3.getHoursWorked()));
            System.out.printf(getOffset(3), employee4.getFirstName(), employee4.getLastName(), employee4.getSocialSecurityNumber(), formatRate(employee4.getCommissionRate()), formatMoney(employee4.getGrossSales()));
            System.out.printf(getOffset(1), employee5.getFirstName(), employee5.getLastName(), employee5.getSocialSecurityNumber(), formatMoney(employee5.getWeeklySalary()));
            System.out.printf(getOffset(4), employee6.getFirstName(), employee6.getLastName(), employee6.getSocialSecurityNumber(), formatMoney(employee6.getBaseSalary()));
            System.out.printf(getOffset(3), employee7.getFirstName(), employee7.getLastName(), employee7.getSocialSecurityNumber(), formatRate(employee7.getCommissionRate()), formatMoney(employee7.getGrossSales()));
    }

    public static String formatMoney(double amount){

            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
            if(amount == (int) amount){
                    currencyFormatter.setMaximumFractionDigits(0);
            }
            return currencyFormatter.format(amount);
    }
    public static String formatRate(double rate){
            if(rate == (int) rate)
                  return Integer.toString((int)rate)+'%';
            return Double.toString(rate)+'%';
    }
    public static String formatHours(double hours){
            if(hours == (int)hours)
                    return Integer.toString((int)hours);
            return Double.toString(hours);
    }
    public static String getOffset(int type){
            return switch (type) {
                //Title
                case 0 -> "%-12s %-11s %-15s %-15s %-7s %-15s %-11s %-15s %-12s\n";
                //Salaried Employee
                case 1 -> "%-12s %-11s %-15s %-15s \n";
                //Hourly Employee
                case 2 -> "%-12s %-11s %-31s %-7s %-5s\n";
                //Commission Employee
                case 3 -> "%-12s %-11s %-55s %-11s %-5s\n";
                //Base Employee
                case 4 -> "%-12s %-11s %-83s %-11s \n";
                default -> "";
            };
    }
}
