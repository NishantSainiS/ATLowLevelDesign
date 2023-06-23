package context;

import strategy.NormalDriveStrategy;

public class BikeVehicle extends Vehicle{
    public BikeVehicle(){
        super(new NormalDriveStrategy());
    }
}
