package pl.sw.Chapter6.Listing_6_23_6_24_6_25_6_26_VarArgs;

public class VarArgs2 {
    public static void main(String[] args) {
        varArgsTest2("Liczba argumentów metody: ");
        varArgsTest2("Liczba argumentów metody: ", 1);
        varArgsTest2("Liczba argumentów metody: ", 1, 2, 3, 4, 5);
    }

    public static void varArgsTest2(String message, int... args) {
        System.out.println(message + " " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        System.out.println();
    }
}
