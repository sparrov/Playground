package pl.sw.Chapter7.Listing_7_1_Shapes;

public class Triangle extends TwoDShapes {
    String style;

    double area() {
        return (width * height) / 2;
    }

    void showStyle() {
        System.out.println("Trójkąt jest " + style);
    }
}
