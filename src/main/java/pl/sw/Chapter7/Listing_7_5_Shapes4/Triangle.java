package pl.sw.Chapter7.Listing_7_5_Shapes4;

public class Triangle extends TwoDShapes {
    String style;

    Triangle(String style, double width, double height) {
        super(width, height);
        this.style = style;
    }

    double area() {
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Trójkąt jest " + style);
    }
}
