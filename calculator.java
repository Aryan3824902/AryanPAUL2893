import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt(); 

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);

        int diff = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + diff);

        int product = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + product);

        int division = num1 / num2;  // Note: will throw exception if num2 == 0
        System.out.println(num1 + " / " + num2 + " = " + division);

        sc.close();
    }
}
