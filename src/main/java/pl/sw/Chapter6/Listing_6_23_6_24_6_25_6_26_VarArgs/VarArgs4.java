package pl.sw.Chapter6.Listing_6_23_6_24_6_25_6_26_VarArgs;

public class VarArgs4 {
    public static void main(String[] args) {
        //varArgsTest(); //niejednoznaczne odwołanie do metody
        //varArgsTest(1,2,3,4,5); //niejednoznaczne odwołanie do metody
    }

    public static void varArgsTest(int x, int... args) {
        System.out.println(x + args.length);
    }

    public static void varArgsTest(int... args) {
        System.out.println(args.length);
    }

    public static void varArgsTest(boolean... args) {
        System.out.println(args.length);
    }
}
