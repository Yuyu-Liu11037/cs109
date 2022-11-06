import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter length of myList1
        System.out.print("Enter the length of myList1: ");
        int n = scanner.nextInt();
        Double[] myList1 = new Double[n];

        //Enter elements of myList1
        System.out.print("Enter " + n +" values: ");
        for(int i = 0; i < n; i++) {
            myList1[i] = scanner.nextDouble();
        }

        //Copy myList1 to myList2
        Double[] myList2;
        myList2 = myList1.clone();

        //Shift myList1
        myList1[n-1] = myList2[0];
        System.arraycopy(myList2, 1, myList1, 0, n-1);

        //Print myList1 and myList2
        System.out.print("myList1:");
        for(int i = 0; i < n; i++){
            System.out.print(myList1[i] + " ");
        }

        System.out.print("\n" + "myList2:");
        for(int i = 0; i < n; i++){
            System.out.print(myList2[i] + " ");
        }

    }
}
