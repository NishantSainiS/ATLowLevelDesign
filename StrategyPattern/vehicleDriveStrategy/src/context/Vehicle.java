package context;

import strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy drivingType;
    Vehicle(DriveStrategy drivingType){
        this.drivingType = drivingType;
    }
    public void drive(){
        drivingType.drive();
    }
}
