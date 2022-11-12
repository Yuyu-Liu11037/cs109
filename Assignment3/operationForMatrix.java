import java.util.Scanner;

public class operationForMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[2*n];
        for(int i = 0; i < 2*n ; i++){
            strings[i] = scanner.nextLine();
        }
        String[][] strings1 = new String[2*n][n];
        for(int i = 0 ; i < 2*n ; i++){
            strings1[i] = strings[i].split(" ");
        }
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                A[i][j] = Integer.parseInt(strings1[i][j]);
            }
        }
        for(int i = n ; i < 2*n ; i++){
            for(int j = 0 ; j < n ; j++){
                B[i-n][j] = Integer.parseInt(strings1[i][j]);
            }
        }

        int temp = 0;
        for(int i = 0 ; i < n/2 ; i++){
            for(int j = 0 ; j < n/2 ; j++){
                System.out.print(A[i][j]+B[i][j] + " ");
            }
            for(int j = n/2 ; j < n-1 ; j++){
                temp = 0;
                for(int k = n/2 ; k < n ; k++){
                    temp += A[i][k]*B[j-n/2][k];
                }
                System.out.print(temp + " ");
                temp = 0;
            }
            for(int k = n/2 ; k < n ; k++){
                temp += A[i][k]*B[n-1-n/2][k];
            }
            System.out.println(temp);
        }

        temp = 0;
        for(int i = n/2 ; i < n ; i++){
            for(int j = 0 ; j < n/2 ; j++){
                for(int k = 0 ; k < n/2 ; k++){
                    temp += A[j+n/2][k]*B[i][k];
                }
                System.out.print(temp + " ");
                temp = 0;
            }
            for(int j = n/2 ; j < n-1 ; j++){
                System.out.print(A[i][j]-B[i][j] + " ");
            }
            System.out.println(A[i][n-1]-B[i][n-1]);
        }
    }
}
