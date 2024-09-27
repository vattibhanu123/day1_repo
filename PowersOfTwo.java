import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the power value N : ");
        int N = sc.nextInt();

        if (N < 0 || N >= 31) {
            System.out.println("Invalid input. N should be between 0 and 30.");
            return;
        }
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
        }

        System.out.print("Enter a year to check if it's a leap year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
