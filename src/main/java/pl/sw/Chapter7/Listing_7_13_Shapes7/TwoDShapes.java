package pl.sw.Chapter7.Listing_7_13_Shapes7;

public class TwoDShapes {
    private double width;
    private double height;

    TwoDShapes() {
        this.width = 0;
        this.height = 0;
    }

    TwoDShapes(double x) {
        this.width = x;
        this.height = x;
    }

    TwoDShapes(TwoDShapes object) {
        this.width = object.width;
        this.height = object.height;
    }

    TwoDShapes(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void showDim() {
        System.out.println("Szerokość i wysokość obiektu: " + width + " i " + height);
    }
}
