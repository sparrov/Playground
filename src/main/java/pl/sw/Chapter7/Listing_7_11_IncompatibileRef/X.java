package pl.sw.Chapter7.Listing_7_11_IncompatibileRef;

public class X {
    int a;

    X(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "X{" +
                "a=" + a +
                '}';
    }
}
