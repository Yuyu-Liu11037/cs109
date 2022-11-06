public class Ex1 {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        if (n<60){
            System.out.println("You failed in the exam.");
            System.out.println("Your score is " + n +", the GPA is 0.0");
        } else if(n>=90){
            System.out.println("You passed the exam.");
            System.out.println("Your score is " + n +", the GPA is 4.0");
        } else if (80<=n) {
            System.out.println("You passed the exam.");
            System.out.println("Your score is " + n +", the GPA is 3.0");
        } else if (70<=n) {
            System.out.println("You passed the exam.");
            System.out.println("Your score is " + n +", the GPA is 2.0");
        } else if (60<=n) {
            System.out.println("You passed the exam.");
            System.out.println("Your score is " + n +", the GPA is 1.0");
        }
    }
}
