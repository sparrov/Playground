package pl.sw.Chapter7.Listing_7_3_Shapes2;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "wypełniony";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "pusty";


        t1.showDim();
        System.out.println("Powierzchnia " + t1.getClass().getSimpleName() + " wynosi: " + t1.area());
        t1.showStyle();

        t2.showDim();
        System.out.println("Powierzchnia " + t2.getClass().getSimpleName() + " wynosi: " + t2.area());
        t2.showStyle();
    }
}
