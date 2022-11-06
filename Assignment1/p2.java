import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++){
            double x_1 = scanner.nextDouble();
            double y_1 = scanner.nextDouble();
            double x_2 = scanner.nextDouble();
            double y_2 = scanner.nextDouble();
            double x = scanner.nextDouble();
            double a = (y_2-y_1)/(x_2-x_1);
            double b = y_1-a*x_1;
            System.out.printf("%.1f\n", a*x+b);
        }
        scanner.close();
    }
}
