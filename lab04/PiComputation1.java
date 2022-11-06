import java.util.Scanner;

public class PiComputation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input n:");
        int n = scanner.nextInt();

        double pi = 0;
        int count = 1;

        while (count<n) {
            if (count % 2 == 0) {
                pi -= 4.0 / (2 * count - 1);
            } else {
                pi += 4.0 / (2 * count - 1);
            }
            count++;
        }
        System.out.println("The estimation of Pi is " + pi);
    }
}
