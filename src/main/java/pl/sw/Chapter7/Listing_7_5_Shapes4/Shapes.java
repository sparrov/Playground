package pl.sw.Chapter7.Listing_7_5_Shapes4;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("wypełniony", 4.0, 4.0);
        Triangle t2 = new Triangle("pusty", 8.0, 12.0);

        t1.showDim();
        System.out.println("Powierzchnia " + t1.getClass().getSimpleName() + " wynosi: " + t1.area());
        t1.showStyle();

        t2.showDim();
        System.out.println("Powierzchnia " + t2.getClass().getSimpleName() + " wynosi: " + t2.area());
        t2.showStyle();
    }
}
