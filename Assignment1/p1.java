import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (0<T && T<100){
            for (int i = 1; i <= T ; i++ ){
                int M = sc.nextInt();
                switch (M){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("yes");
                        break;
                    case 2:
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("no");
                }
            }
        }
    }
}
