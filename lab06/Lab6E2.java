import java.util.Scanner;

public class Lab6E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two numbers for bottom and height:");
        double bottom = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("The area is " + MyTriangle.area(bottom,height));

        System.out.println("Please input two numbers for a and b:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Please input a number in (0,180) for an angle (angle is a float variable):");
        int angle = scanner.nextInt();
        System.out.println("The area is " + MyTriangle.area(a, b, angle));
        }
    }
