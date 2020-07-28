package pl.sw.Chapter6.Listing_6_23_6_24_6_25_6_26_VarArgs;

public class VarArgs3 {
    public static void main(String[] args) {
        varArgsTest("Liczba argumentów: ", 1, 2, 3);
        varArgsTest("Liczba argumentów: ", true, true, false);
        varArgsTest("Liczba argumentów: ", 'a', 'b', 'c');
    }

    public static void varArgsTest(String message, int... args) {
        System.out.println(message + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        System.out.println();
    }

    public static void varArgsTest(String message, boolean... args) {
        System.out.println(message + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        System.out.println();
    }

    public static void varArgsTest(String message, char... args) {
        System.out.println(message + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        System.out.println();
    }
}
