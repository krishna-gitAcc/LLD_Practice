package com.CarParkingLLD.ParkingSport;

import java.util.ArrayList;
import java.util.List;

import com.CarParkingLLD.ParkingSport.ParkingSportInterface.ParkingSpot;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager() {
        parkingSpotList = new ArrayList<>();
    }

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public void addParkingSport(ParkingSpot parkingSpot){
        parkingSpotList.add(parkingSpot);
    }

    public ParkingSpot findParkingSpot(){
        ParkingSpot vacantSport;
        vacantSport = parkingSpotList.stream().filter(sp->!sp.isParked).findAny().get();
        return vacantSport;
    }



}
