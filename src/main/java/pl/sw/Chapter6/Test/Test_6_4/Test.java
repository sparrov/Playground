package pl.sw.Chapter6.Test.Test_6_4;

public class Test {
    int a;

    Test(int a) {
        this.a = a;
    }

    public static void swap(Test object1, Test object2) {
        int temp = object1.a;
        object1.a = object2.a;
        object2.a = temp;

    }

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                '}';
    }
}
