import java.util.Scanner;
import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int flips = 0;

        System.out.print("Enter the number of times to flip the coin : ");
        flips = scanner.nextInt();
        if (flips < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < flips; i++) {
            if (random.nextDouble() < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        double headsPercentage = ((double) heads / flips) * 100;
        double tailsPercentage = ((double) tails / flips) * 100;

        System.out.println("Total Flips: " + flips);
        System.out.println("HeadsPercentage " + headsPercentage + "%");
        System.out.println("TailsPercentage: " + tailsPercentage + "%");
    }
}
