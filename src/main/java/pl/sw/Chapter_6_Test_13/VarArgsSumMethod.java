package pl.sw.Chapter_6_Test_13;

public class VarArgsSumMethod {
    public static void main(String[] args) {
        System.out.println(sumOfInts(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(sumOfInts());
    }

    public static int sumOfInts(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += args[i];
        }
        return sum;
    }
}
