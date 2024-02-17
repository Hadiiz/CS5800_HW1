package Question2;
import Question1.BaseEmployee;
import Question1.CommissionEmployee;
import Question1.HourlyEmployee;
import Question1.SalariedEmployee;

import java.text.NumberFormat;

public class Main {


    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("USS Indianapolis", "1930");
        ships[1] = new CruiseShip("Icon Of The Seas", "2023", 5610);
        ships[2] = new CargoShip("COSCO Shipping Universe", "2018", 21237);

        for (Ship ship : ships) {
            ship.print();
        }
    }

}
