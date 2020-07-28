package pl.sw.Chapter7.Listing_7_14_Override;

public class B extends A {
    int c;

    B(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    void show() {
        System.out.println("c: " + c);
    }

    @java.lang.Override
    public String toString() {
        return "B{" +
                "c=" + c +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
