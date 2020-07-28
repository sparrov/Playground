package pl.sw.Chapter7.Listing_7_17_DynShapes;

public class Rectangle extends TwoDShapes {
    Rectangle() {
        super();
    }

    Rectangle(double x) {
        super(x, "kwadrat");
    }

    Rectangle(double width, double height) {
        super(width, height, "prostokąt");
    }

    Rectangle(Rectangle object) {
        super(object);
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) {
            return true;
        }
        return false;
    }

    double area() {

        return getWidth() * getHeight();
    }

}
