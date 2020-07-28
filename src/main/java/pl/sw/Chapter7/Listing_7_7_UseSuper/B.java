package pl.sw.Chapter7.Listing_7_7_UseSuper;

public class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        this.i = b;
    }

    void show() {
        System.out.println("i w klasie bazowej: " + super.i);
        System.out.println("i w klasie pochodnej: " + this.i);
    }
}
