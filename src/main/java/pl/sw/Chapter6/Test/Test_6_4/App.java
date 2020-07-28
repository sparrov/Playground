package pl.sw.Chapter6.Test.Test_6_4;

public class App {
    public static void main(String[] args) {
        Test object1 = new Test(5);
        Test object2 = new Test(10);

        System.out.println(object1);
        System.out.println(object2);

        Test.swap(object1, object2);
        System.out.println(object1);
        System.out.println(object2);
    }
}
