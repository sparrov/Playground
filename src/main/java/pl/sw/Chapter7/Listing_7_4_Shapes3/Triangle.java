package pl.sw.Chapter7.Listing_7_4_Shapes3;

public class Triangle extends TwoDShapes {
    String style;

    Triangle(String style, double width, double height) {
        setWidth(width);
        setHeight(height);
        this.style = style;
    }

    double area() {
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Trójkąt jest " + style);
    }
}
