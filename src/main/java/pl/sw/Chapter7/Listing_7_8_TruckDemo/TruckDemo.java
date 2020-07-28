package pl.sw.Chapter7.Listing_7_8_TruckDemo;

public class TruckDemo {
    public static void main(String[] args) {
        Truck semiTruck = new Truck(2, 200, 25, 4);
        Truck pickup = new Truck(3, 100, 15, 1);

        int distanceToGo = 1300;

        double semiTruckFuelNeededInLiters = semiTruck.fuelNeeded(distanceToGo);
        double pickupFuelNeededInLiters = pickup.fuelNeeded(distanceToGo);

        System.out.println("Półcieżarówka ma ładowność: " + semiTruck.getCargoCap() + "t");
        System.out.println("Aby pokonać dystans "
                + distanceToGo
                + " km"
                + " półciężarówka potrzebuje "
                + semiTruckFuelNeededInLiters
                + " litrów paliwa");

        System.out.println("Pickup ma ładowność " + pickup.getCargoCap() + "t");
        System.out.println("Aby pokonać dystans "
                + distanceToGo
                + " km"
                + " pickup potrzebuje "
                + pickupFuelNeededInLiters
                + " litrów paliwa");
    }


}
