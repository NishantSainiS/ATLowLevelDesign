package context;

import strategy.SportDriveStrategy;

public class FormulaVehicle extends Vehicle{
    public FormulaVehicle(){
        super(new SportDriveStrategy());
    }
}
