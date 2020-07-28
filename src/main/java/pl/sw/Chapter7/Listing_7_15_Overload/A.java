package pl.sw.Chapter7.Listing_7_15_Overload;

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

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
