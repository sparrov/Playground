package pl.sw.Chapter7.Listing_7_9_Shapes6;

public class Shapes {
    public static void main(String[] args) {
        ColorTriangle t0 = new ColorTriangle("black", 5);
        ColorTriangle t1 = new ColorTriangle("red", "fullFill", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("blue", "halfFill", 4.0, 2.0);


        t0.showDim();
        t0.showColor();
        System.out.println("Powierzchnia " + t0.getClass().getSimpleName() + " wynosi: " + t0.area());
        t0.showStyle();

        t1.showDim();
        t1.showColor();
        System.out.println("Powierzchnia " + t1.getClass().getSimpleName() + " wynosi: " + t1.area());
        t1.showStyle();

        t2.showDim();
        t2.showColor();
        System.out.println("Powierzchnia " + t2.getClass().getSimpleName() + " wynosi: " + t2.area());
        t2.showStyle();
    }
}
