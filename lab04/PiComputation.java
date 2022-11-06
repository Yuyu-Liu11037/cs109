import java.util.Scanner;

public class PiComputation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the precision:");
        double precision = scanner.nextDouble();

        double pi = 0;
        int count = 0;
        double pre = 3.14;
        while (Math.abs(pre - pi) >= precision) {
            pre = pi;
            count++;
            if (count % 2 == 0) {
                pi -= 4.0 / (2 * count - 1);
            } else {
                pi += 4.0 / (2 * count - 1);
            }

        }
        System.out.println("The estimation of Pi is " + pi);
    }

}
