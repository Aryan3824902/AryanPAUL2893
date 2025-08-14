import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start year: ");
        int s = sc.nextInt();

        System.out.print("Enter end year: ");
        int e = sc.nextInt();
        int year = 0;

        int count = 0;

        System.out.println("Leap years between " + s + " and " + e + ":");

        for (year = s; year <= e; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.print(year + " ");
                count++;
            }
        }
        System.out.println("Total number of leap years: " + count);
    }
}
