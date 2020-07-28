package pl.sw.Chapter7.Test.Test_7_2;

public class DynShapes {
    public static void main(String[] args) {

        TwoDShapes[] arrayOfTwoDShapes = new TwoDShapes[2];

        arrayOfTwoDShapes[0] = new Circle(8.0);
        arrayOfTwoDShapes[1] = new Circle(10.0);


        for (int i = 0; i < arrayOfTwoDShapes.length; i++) {
            System.out.println("Typ obiektu: " + arrayOfTwoDShapes[i].getName());
            System.out.println("Powierzchnia wynosi: " + arrayOfTwoDShapes[i].area());
            System.out.println();
        }

    }


}
