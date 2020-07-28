package pl.sw.Chapter7.Listing_7_6_Shapes5;

public class TwoDShapes {
    private double width;
    private double height;

    TwoDShapes() {
        this.width = 0;
        this.height = 0;
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
