package com.LLDCarRental.Vehicle;

public class Vehicle {
    int vehicleId;
    int vehicleNumber;
    VehicleType vehicleType;
    String company;
    String modelName;
    int kmDriven;
    int average;
    int rentPerDay;
    int rentPerHour;
    int noOfSeats;
    Status status;

    public Vehicle() {
    }

    public Vehicle(int vehicleId, int vehicleNumber, VehicleType vehicleType, String company, String modelName,
            int kmDriven, int average, int rentPerDay, int rentPerHour, int noOfSeats, Status status) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.company = company;
        this.modelName = modelName;
        this.kmDriven = kmDriven;
        this.average = average;
        this.rentPerDay = rentPerDay;
        this.rentPerHour = rentPerHour;
        this.noOfSeats = noOfSeats;
        this.status = status;
    }

    public int getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
    public int getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getKmDriven() {
        return kmDriven;
    }
    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }
    public int getAverage() {
        return average;
    }
    public void setAverage(int average) {
        this.average = average;
    }
    public int getRentPerDay() {
        return rentPerDay;
    }
    public void setRentPerDay(int rentPerDay) {
        this.rentPerDay = rentPerDay;
    }
    public int getRentPerHour() {
        return rentPerHour;
    }
    public void setRentPerHour(int rentPerHour) {
        this.rentPerHour = rentPerHour;
    }
    public int getNoOfSeats() {
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }



}
