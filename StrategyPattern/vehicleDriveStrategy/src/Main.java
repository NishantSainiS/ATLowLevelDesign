import context.BikeVehicle;
import context.FormulaVehicle;
import context.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting ...");
        Vehicle bike = new BikeVehicle();
        Vehicle formula = new FormulaVehicle();
        bike.drive();
        formula.drive();
        System.out.println("Ending ...");

    }
}