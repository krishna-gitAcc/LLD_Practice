package com.LLDCarRental;

import java.util.List;

import com.LLDCarRental.Vehicle.Vehicle;

public class VehicleInventoryController {
    List<Vehicle> vehicles;

    public VehicleInventoryController() {
        
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

}
