class SumDemo {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }
    public double sum(int a, double b) {
        return a + b;
    }
}

public class PolymorphismOfSum {
    public static void main(String args[]) {
        SumDemo obj = new SumDemo();

        System.out.println("Sum of 2 integers: " + obj.sum(10, 20));
        System.out.println("Sum of 2 doubles: " + obj.sum(12.5, 7.5));
        System.out.println("Sum of int + double: " + obj.sum(10, 5.5));
    }
}
