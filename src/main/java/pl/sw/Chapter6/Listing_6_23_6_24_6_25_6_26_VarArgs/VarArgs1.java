package pl.sw.Chapter6.Listing_6_23_6_24_6_25_6_26_VarArgs;

public class VarArgs1 {
    public static void main(String[] args) {
        varArgsTest();
        varArgsTest(1);
        varArgsTest(1, 2);
        varArgsTest(1, 2, 3);
    }

    static void varArgsTest(int... args) {
        System.out.println("Liczba argumentów: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        System.out.println();
    }
}
