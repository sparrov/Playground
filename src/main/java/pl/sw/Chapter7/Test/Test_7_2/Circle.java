package pl.sw.Chapter7.Test.Test_7_2;

public class Circle extends TwoDShapes {
    private double PI = Math.PI;

    Circle() {
        super();
    }

    Circle(double x) {
        super(x, "Koło");
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }


    @Override
    double area() {
        System.out.println("Metoda z klasy Circle");
        return PI * ((getWidth() / 2) * (getHeight() / 2));
    }
}
