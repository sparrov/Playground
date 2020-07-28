package pl.sw.Chapter7.Listing_7_11_IncompatibileRef;

public class Y {
    int a;

    Y(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Y{" +
                "a=" + a +
                '}';
    }
}
