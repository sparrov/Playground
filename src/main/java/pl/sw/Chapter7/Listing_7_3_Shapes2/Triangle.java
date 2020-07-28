package pl.sw.Chapter7.Listing_7_3_Shapes2;

public class Triangle extends TwoDShapes {
    String style;

    double area() {
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Trójkąt jest " + style);
    }
}
