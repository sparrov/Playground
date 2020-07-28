package pl.sw.Chapter6.Listing_6_21_NestedClass;

public class Outer {
    private int[] numbers;

    public Outer(int[] numbers) {
        this.numbers = numbers;
    }

    public void calculate() {
        Inner inner = new Inner();
        System.out.println("Wartość min: " + inner.min());
        System.out.println("Wartość max: " + inner.max());
        System.out.println("Srednia: " + inner.avg());
    }

    class Inner {

        private int min() {
            int min = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            return min;
        }

        private int max() {
            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            return max;
        }

        private double avg() {
            int sum = 0;
            double avg;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            avg = sum / numbers.length;
            return avg;
        }
    }
}