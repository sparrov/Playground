package pl.sw.Chapter7.Listing_7_14_Override;

public class A {
    int a;
    int b;

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void show() {
        System.out.println("a i b: " + a + " " + b);
    }

    @java.lang.Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
