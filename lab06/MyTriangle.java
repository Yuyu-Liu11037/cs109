import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please input three numbers for a,b,c:");
            double x = scanner.nextDouble();
            if (x == -1){
                System.out.println("Bye~");
                System.exit(0);
            }
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();
            if(isValid(x,y,z)){
                System.out.println("The area is " + area(x,y,z));
                System.out.println("The perimeter is " + perimeter(x,y,z));
            } else {
                System.out.println("The input is invalid.");
            }
            continue;
        }
}

    public static double area(double a, double b, double c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static double perimeter(double a, double b, double c){
        return a+b+c;
    }
    public static boolean isValid(double a, double b, double c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }

    public static double area(double buttom, double height){
        return 0.5*buttom*height;
    }
    public static double area(double a, double b, int angleOfAandB){
        return 0.5*a*b*Math.sin(Math.toRadians(angleOfAandB));
    }
}

