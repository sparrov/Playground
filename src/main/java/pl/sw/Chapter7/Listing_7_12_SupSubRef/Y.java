package pl.sw.Chapter7.Listing_7_12_SupSubRef;

public class Y extends X {
    int b;


    Y(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public String toString() {
        return "Y{" +
                "b=" + b +
                ", a=" + a +
                '}';
    }
}
