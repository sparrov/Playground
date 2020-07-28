package pl.sw.Chapter7.Test.Test_7_2;

public abstract class TwoDShapes {
    private double width;
    private double height;
    private String name;

    TwoDShapes() {
        this.width = 0;
        this.height = 0;
        this.name = "none";
    }

    TwoDShapes(double x, String name) {
        this.width = x;
        this.height = x;
        this.name = name;

    }

    TwoDShapes(TwoDShapes object) {
        this.width = object.width;
        this.height = object.height;
        this.name = object.name;
    }

    TwoDShapes(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    void setName(String name) {
        this.name = name;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Szerokość i wysokość obiektu: " + width + " i " + height);
    }

    abstract double area();
}
