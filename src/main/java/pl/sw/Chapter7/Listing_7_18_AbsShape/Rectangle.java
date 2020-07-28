package pl.sw.Chapter7.Listing_7_18_AbsShape;

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

    @Override
    double area() {
        System.out.println("Metoda z klasy Rectangle");
        return getWidth() * getHeight();
    }

}
