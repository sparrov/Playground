package pl.sw.Chapter7.Listing_7_12_SupSubRef;

public class SupSubRef {
    public static void main(String[] args) {
        X objectX;
        X objectX1 = new X(5);
        Y objectY1 = new Y(10, 15);
        objectX = objectX1;
        objectX = objectY1;

        System.out.println(objectX.toString());
        System.out.println(objectX1.toString());
        System.out.println(objectX.equals(objectX1));
        System.out.println(objectX.hashCode());
        System.out.println(objectX1.hashCode());

        System.out.println(objectX1.a);
        System.out.println(objectY1.a + " " + objectY1.b);
        System.out.println(objectX.a);
    }
}
