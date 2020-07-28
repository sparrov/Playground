package pl.sw.Chapter7.Listing_7_8_TruckDemo;

public class Vehicle {
    private int passengers;
    private int fuelCap;
    private double lkm;

    Vehicle(int passengers, int fuelCap, double lkm) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.lkm = lkm;
    }

    void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    void setLkm(double lkm) {
        this.lkm = lkm;
    }

    int getPassengers() {
        return passengers;
    }

    int getFuelCap() {
        return fuelCap;
    }

    double getLkm() {
        return lkm;
    }


    int range() {
        return (int) (fuelCap / lkm * 100);
    }

    double fuelNeeded(int distance) {
        return distance * lkm / 100;
    }
}
