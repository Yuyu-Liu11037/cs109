import java.util.Scanner;

public class bestPokerHand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String[] l1 = line1.split(" ");
        String line2 = scanner.nextLine();
        String[] l2 = line2.split(" ");
        String line3 = scanner.nextLine();
        String[] l3 = line3.split(" ");
        String line4 = scanner.nextLine();
        String[] l4 = line4.split(" ");
        String line5 = scanner.nextLine();
        String[] l5 = line5.split(" ");
        char[] suits = {l1[0].charAt(0),l2[0].charAt(0),l3[0].charAt(0),l4[0].charAt(0),l5[0].charAt(0)};
        int[] ranks = {Integer.parseInt(l1[1]),Integer.parseInt(l2[1]),Integer.parseInt(l3[1]),Integer.parseInt(l4[1]),Integer.parseInt(l5[1])};

        if(isFlush(suits)){
            if(isStraight(ranks)){
                System.out.println("Straight Flush");
            } else {
                System.out.println("Flush");
            }
        } else if(isStraight(ranks)){
            System.out.println("Straight");
        } else {
            int same = sameRank(ranks);
            if(same >= 3){
                System.out.println("Three of a Kind");
            } else if (same == 2) {
                System.out.println("Pair");
            } else {
                System.out.println("High Card");
            }
        }
    }

    private static boolean isFlush(char[] suits){
        char c = suits[0];
        for (int i = 0; i < 5; i++) {
            if(c != suits[i]) return false;
        }
        return true;
    }

    private static boolean isStraight(int[] rank){
        int n = rank.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (rank[j] > rank[j + 1]) {
                    int temp = rank[j];
                    rank[j] = rank[j + 1];
                    rank[j + 1] = temp;
                }
        if(rank[0] == rank[1]-1 && rank[1] == rank[2]-1 && rank[2] == rank[3]-1 && rank[3] == rank[4]-1){
            return true;
        } else {
            return false;
        }
    }

    private static int sameRank(int[] rank){
        int[] arr = new int[14];
        for(int i : rank){
            arr[i]++;
        }
        int max = 1;
        for(int i : arr){
            max = Math.max(max,i);
        }
        return max;
    }
}
