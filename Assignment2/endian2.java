import java.util.Scanner;

public class endian2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String what = scanner.nextLine();
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        if(n>1){
            for (int i = 0; i < n-1; i++) {
                char[] ch = s[i].toCharArray();
                toBigEndian2(ch);
                System.out.print(" ");
            }
            char[] ch = s[n-1].toCharArray();
            toBigEndian2(ch);
        } else {
            char[] ch = s[0].toCharArray();
            toBigEndian2(ch);
        }

    }

    public static void toBigEndian2(char[] ch) {
        System.out.print(ch[6]);
        System.out.print(ch[7]);
        System.out.print(ch[4]);
        System.out.print(ch[5]);
        System.out.print(ch[2]);
        System.out.print(ch[3]);
        System.out.print(ch[0]);
        System.out.print(ch[1]);
    }

}
