package pl.sw.Chapter7.Listing_7_14_Override;

public class Override {
    public static void main(String[] args) {
        A objectA = new A(1, 2);
        B objectB = new B(1, 2, 4);
        A objectC = new B(10, 20, 30);

        System.out.println(objectA);
        System.out.println(objectB);

        objectA.show();
        objectB.show();
        objectC.show();

    }
}
