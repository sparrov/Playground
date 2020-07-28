package pl.sw.Chapter7.Listing_7_6_Shapes5;

public class Triangle extends TwoDShapes {
    String style;

    Triangle() {
        super();
        this.style = "nieokreślony";
    }

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
