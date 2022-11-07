import java.util.Locale;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Type a string (\"quit\" to finish): ");
            String s = scanner.next();
            String s2 = s.toLowerCase();
            if(s.equals("quit")){
                break;
            }
            char[] ch1 = new char[s2.length()];
            char[] ch2 = new char[s2.length()];
            for(int i = 0; i < s.length(); i++){
                ch1[i]=s2.charAt(i);
            }
            for(int i = s.length()-1; i >= 0; i--){
                ch2[s.length()-1-i]=s2.charAt(i);
            }
            for(int i = 0; i < s.length() ; i++){
                if(ch1[i] != ch2[i]){
                    System.out.println(s + " is not a palindrome");
                } else {
                    System.out.println(s + " is a palindrome");
                }
                break;
            }
        }
    }
}
