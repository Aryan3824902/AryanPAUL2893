import java.util.Scanner;

public class meters2foot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double meters = scanner.nextDouble();

        double foot = meters * 3.281;  // Missing semicolon here

        // Fix string concatenation syntax in println
        System.out.println("meters of " + meters + " to foot are " + foot);

        scanner.close();
    }
}
