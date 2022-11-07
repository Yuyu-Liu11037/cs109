import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s1: ");
        String myString = scanner.nextLine();
        int count = 0, startIndex = 0;
        System.out.print("s2: ");
        String mySubstring = scanner.nextLine();
        List<Integer> indices=new ArrayList<>();
        Pattern pattern = Pattern.compile(mySubstring);
        Matcher match = pattern.matcher(myString);
        while(match.find(startIndex)){
            count++;
            indices.add(match.start());
            startIndex = match.start() + 1;
            System.out.println("Found at index: " + indices.get(count - 1));
        }
        System.out.println("Total occurrences: " + count);
    }
}
