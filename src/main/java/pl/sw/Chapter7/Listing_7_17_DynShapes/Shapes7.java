package pl.sw.Chapter7.Listing_7_17_DynShapes;

public class Shapes7 {
    public static void main(String[] args) {

        TwoDShapes[] arrayOfTwoDShapes = new TwoDShapes[5];

        arrayOfTwoDShapes[0] = new Triangle(8.0, 12.0, "pusty");
        arrayOfTwoDShapes[1] = new Rectangle(10.0);
        arrayOfTwoDShapes[2] = new Rectangle(10.0, 4.0);
        arrayOfTwoDShapes[3] = new Triangle(7);
        arrayOfTwoDShapes[4] = new TwoDShapes(10, 20, "ogólny");

        for (int i = 0; i < arrayOfTwoDShapes.length; i++) {
            System.out.println("Typ obiektu: " + arrayOfTwoDShapes[i].getName());
            System.out.println("Powierzchnia wynosi: " + arrayOfTwoDShapes[i].area());
            System.out.println();
        }

    }


}
