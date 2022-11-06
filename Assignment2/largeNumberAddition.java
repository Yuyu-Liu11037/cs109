import java.math.BigInteger;
import java.util.Scanner;

public class largeNumberAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            String what = scanner.nextLine();
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            String[] l1 = line1.split(" ");
            String[] l2 = line2.split(" ");
            BigInteger number1 = BigInteger.valueOf(0);
            BigInteger number2 = BigInteger.valueOf(0);
            for(int j = 0; j < p; j++){
                number1 = number1.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(Integer.parseInt(l1[j])));
            }
            for(int j = 0; j < q; j++){
                number2 = number2.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(Integer.parseInt(l2[j])));
            }
            System.out.printf("\n" + number1.add(number2));
        }
        scanner.close();
    }
}
