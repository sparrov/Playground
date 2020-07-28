package pl.sw.Chapter7.Listing_7_15_Overload;

public class B extends A {
    int c;

    B(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    void show(String message) {
        System.out.println(message + c);
    }

    @Override
    public String toString() {
        return "B{" +
                "c=" + c +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
