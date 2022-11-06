import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;

        for (int i = 1; i <= T; i++){
            int s = input.nextInt();
            if (90 <= s){
                A += 1;
            } else if (80 <= s) {
                B += 1;
            } else if (70 <= s) {
                C += 1;
            } else if (60 <= s) {
                D += 1;
            } else {
                F += 1;
            }
        }

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

        input.close();
    }
}
