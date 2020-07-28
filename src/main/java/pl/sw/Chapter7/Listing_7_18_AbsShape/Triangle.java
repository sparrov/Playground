package pl.sw.Chapter7.Listing_7_18_AbsShape;

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

    @Override
    double area() {
        System.out.println("Metoda z klasy Triangle");
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Trójkąt jest " + style);
    }
}
