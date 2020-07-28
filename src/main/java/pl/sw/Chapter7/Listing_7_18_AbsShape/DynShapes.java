package pl.sw.Chapter7.Listing_7_18_AbsShape;

public class DynShapes {
    public static void main(String[] args) {

        TwoDShapes[] arrayOfTwoDShapes = new TwoDShapes[4];

        arrayOfTwoDShapes[0] = new Triangle(8.0, 12.0, "pusty");
        arrayOfTwoDShapes[1] = new Rectangle(10.0);
        arrayOfTwoDShapes[2] = new Rectangle(10.0, 4.0);
        arrayOfTwoDShapes[3] = new Triangle(7);

        for (int i = 0; i < arrayOfTwoDShapes.length; i++) {
            System.out.println("Typ obiektu: " + arrayOfTwoDShapes[i].getName());
            System.out.println("Powierzchnia wynosi: " + arrayOfTwoDShapes[i].area());
            System.out.println();
        }

    }


}
