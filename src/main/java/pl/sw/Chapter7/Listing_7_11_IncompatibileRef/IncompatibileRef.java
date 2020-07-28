package pl.sw.Chapter7.Listing_7_11_IncompatibileRef;

public class IncompatibileRef {
    public static void main(String[] args) {
        X objectX;
        X objectX1 = new X(5);
        objectX = objectX1;
        Y objectY1 = new Y(10);
        //objectX = objectY1;

        System.out.println(objectX.toString());
        System.out.println(objectX1.toString());
        System.out.println(objectX.equals(objectX1));
        System.out.println(objectX.hashCode());
        System.out.println(objectX1.hashCode());
    }
}
