package pl.sw.Chapter6.Listing_6_21_NestedClass;

public class NestedClassDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Outer outer = new Outer(array);
        outer.calculate();
    }
}
