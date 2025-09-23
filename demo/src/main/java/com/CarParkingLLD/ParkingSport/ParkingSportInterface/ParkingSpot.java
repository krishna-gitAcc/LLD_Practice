package com.CarParkingLLD.ParkingSport.ParkingSportInterface;

public class ParkingSpot implements ParkingSportInterface {
    public int Id;
    public int pricePerHour;
    public boolean isParked;
    int xCoord;
    int yCoord;

    public ParkingSpot(int id, int pricePerHour, int xCoord, int yCoord){
        this.Id = id;
        this.pricePerHour = pricePerHour;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    @Override
    public void parkTheVehicle(){
        this.isParked = true;
    }

    @Override
    public void unparkTheVehicle(){
        this.isParked = false;
    }


}
