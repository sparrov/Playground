package pl.sw.Chapter7.Listing_7_17_DynShapes;

public class Triangle extends TwoDShapes {
    private String style;

    Triangle() {
        super();
        this.style = "nieokreślony";
    }

    Triangle(double x) {
        super(x, "trójkąt");
        this.style = "semiFill";
    }

    Triangle(Triangle object) {
        super(object);
        this.style = object.style;
    }

    Triangle(double width, double height, String style) {
        super(width, height, "trójkąt");
        this.style = style;
    }

    double area() {
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Trójkąt jest " + style);
    }
}
