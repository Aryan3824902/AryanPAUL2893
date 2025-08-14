import java.util.Scanner;

public class NumberPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();
        if (a != b && b != c && a != c) { 
            if (a < b && b < c) {
                System.out.println("Strictly Increasing");
            } else if (a > b && b > c) {
                System.out.println("Strictly Decreasing");
            } else if (b > a && b > c) {
                System.out.println("Middle number is largest");
            } else {
                System.out.println("No specific pattern");
            }
        } else {
            System.out.println("Numbers are not all different");
        }
    }
}
