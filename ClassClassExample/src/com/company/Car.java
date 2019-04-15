package com.company;

/**
 * Created by dbaker on 2/1/2019.
 */
public class Car {
    //properties
    String make;
    String model;
    double milesTraveled;
    double mpg;
    double tankSize;
    double gallonsOfGas;

    //constructor(s)
    public Car(){
        make = "Ford";
        model = "Escape";
        milesTraveled = 0;
        mpg = 24;
        tankSize = 12;
        gallonsOfGas = tankSize;
    }
    public Car(String Make, String model, double MPG, double TankSize){
        make = Make;
        this.model = model;
        mpg = MPG;
        tankSize = TankSize;
        gallonsOfGas = tankSize;
        milesTraveled =0;
    }
    //methods
    public void DriveTillEmpty(){
        milesTraveled = milesTraveled + mpg*gallonsOfGas;
        gallonsOfGas=0;
    }
    public  void FillTank(){
        gallonsOfGas = tankSize;
    }
    public void DriveXMiles(double x){
        if(gallonsOfGas >= x/mpg) {
            //have enough
            milesTraveled = milesTraveled + x;
            gallonsOfGas = gallonsOfGas - x / mpg;
        }
        else {
            //didnt have enough gallons
            DriveTillEmpty();
        }

    }
}
