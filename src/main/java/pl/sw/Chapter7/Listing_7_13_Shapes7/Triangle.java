package pl.sw.Chapter7.Listing_7_13_Shapes7;

public class Triangle extends TwoDShapes {
    private String style;

    Triangle() {
        super();
        this.style = "nieokreślony";
    }

    Triangle(double x) {
        super(x);
        style = "semiFill";
    }

    Triangle(Triangle object) {
        super(object);
        style = object.style;
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
