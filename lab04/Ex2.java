public class Ex2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        for(int i : array){
            int j = 1;
            while (j <= i){
                System.out.printf(i + " * " + j + " = " + (i*j) + "  ");
                j += 1;
            }
            System.out.println();
        }
    }
}
