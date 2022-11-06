import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 1; i <= T; i++){
            int y = input.nextInt();
            if (y%400 == 0 || (y%100 != 0 && y%4 == 0)){
                System.out.println("Yes");
                int n_1 = (2000-y)/4;
                int n_2 = (2000-y)/400;
                int n_3 = (2000-y)/100;
                System.out.println(306+(2000-y-1)*365+n_1+n_2-n_3);
            } else {
                System.out.println("No");
            }
        }
        input.close();
    }
}
