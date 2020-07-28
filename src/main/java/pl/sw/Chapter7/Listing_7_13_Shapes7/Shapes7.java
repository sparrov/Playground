package pl.sw.Chapter7.Listing_7_13_Shapes7;

public class Shapes7 {
    public static void main(String[] args) {
        TwoDShapes object0 = new TwoDShapes(10, 20);

        TwoDShapes object1 = new TwoDShapes(object0);

        System.out.println(object1.getWidth());
        System.out.println(object1.getHeight());

        System.out.println(object0.equals(object1));
        System.out.println(object0.hashCode());
        System.out.println(object1.hashCode());

        Triangle t0 = new Triangle("blank", 30, 60);
        Triangle t1 = new Triangle(t0);//kopia obiektu t0

        t0.showDim();
        System.out.println("Powierzchnia " + t0.getClass().getSimpleName() + " wynosi: " + t0.area());
        t0.showStyle();

        t1.showDim();
        System.out.println("Powierzchnia " + t1.getClass().getSimpleName() + " wynosi: " + t1.area());
        t1.showStyle();

    }


}
