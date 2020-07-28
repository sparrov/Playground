package pl.sw.Chapter7.Listing_7_2_Triangle;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        //t1.width = 4.0;
        //t1.height = 4.0;
        t1.style = "wypełniony";

        //t2.width = 8.0;
        //t2.height = 12.0;
        t2.style = "pusty";


        t1.showDim();
        //System.out.println("Powierzchnia " + t1.getClass().getSimpleName() + " wynosi: " + t1.area());
        t1.showStyle();

        t2.showDim();
        //System.out.println("Powierzchnia " + t2.getClass().getSimpleName() + " wynosi: " + t2.area());
        t2.showStyle();
    }
}
