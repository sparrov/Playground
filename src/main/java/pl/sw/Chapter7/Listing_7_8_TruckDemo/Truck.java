package pl.sw.Chapter7.Listing_7_8_TruckDemo;

public class Truck extends Vehicle {
    private int cargoCap;

    Truck(int passengers, int fuelCap, double lkm, int cargoCap) {
        super(passengers, fuelCap, lkm);
        this.cargoCap = cargoCap;
    }

    void setCargoCap(int cargoCap) {
        this.cargoCap = cargoCap;
    }

    int getCargoCap() {
        return cargoCap;
    }
}
