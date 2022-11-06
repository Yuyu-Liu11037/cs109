import java.util.Scanner;

public class endian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String what = scanner.nextLine();
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        for (int i = 0; i < n; i++) {
            System.out.println(Integer.toHexString(bigToLittle(Integer.parseInt(s[i],16))));
        }
    }

    static int bigToLittle(int i){
        return (i&0xff000000)>>24 | (i&0xff0000)>>8 | (i&0xff00)<<8 | (i&0xff)<<24;
    }
}
