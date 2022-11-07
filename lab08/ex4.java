import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a string: ");
        String string = scanner.nextLine();
        if(string.equals("") == false){
            removeDuplicates(string.replaceAll("\\s", ""));
        } else {
            System.out.println("Empty string, exit...");
        }



    }

    public static void removeDuplicates(String str){
        String newstr = new String();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAtPosition = str.charAt(i);
            if (newstr.indexOf(charAtPosition) < 0) {
                newstr += charAtPosition;
            }
        }
        System.out.println("After removing repeating chars and spaces: " +newstr);
    }
}
