import java.util.ArrayList;
import java.util.Scanner;

public class missingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String what = scanner.nextLine();
        String string = scanner.nextLine();
        String[] input = string.split(" ");

        ArrayList<Integer> missing = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            missing.add(i);
        }

        for (String s : input) {
            if (missing.contains(Integer.parseInt(s))) {
                missing.remove((Integer) Integer.parseInt(s));
            }
        }

        if(missing.isEmpty()){
            System.out.println("NULL");
        } else {
            for(int i = 0; i < missing.size()-1 ; i++){
                System.out.print(missing.get(i) + " ");
            }
            System.out.print(missing.get(missing.size()-1));
        }
    }
}
