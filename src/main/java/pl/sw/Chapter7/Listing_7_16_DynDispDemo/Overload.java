package pl.sw.Chapter7.Listing_7_16_DynDispDemo;

public class Overload {
    public static void main(String[] args) {
        Super super1 = new Super();
        Sub1 sub1 = new Sub1();
        Sub2 sub2 = new Sub2();

        Super superReference;
        superReference = super1;
        superReference.who();
        superReference = sub1;
        superReference.who();
        superReference = sub2;
        superReference.who();


    }
}
