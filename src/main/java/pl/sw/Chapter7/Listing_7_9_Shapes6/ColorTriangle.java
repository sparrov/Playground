package pl.sw.Chapter7.Listing_7_9_Shapes6;

public class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String color, String style, double width, double height) {
        super(style, width, height);
        this.color = color;
    }

    ColorTriangle(String color, double x) {
        super(x);
        this.color = color;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color = color;
    }

    void showColor() {
        System.out.println("Trójkąt w kolorze: " + color);
    }


}
