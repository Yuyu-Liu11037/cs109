import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.print("Preferred System: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        switch (string){
            case "ios":
                System.out.println(PhoneModel.IPHONE + "     " + PhoneModel.IPHONE.getOs());
                break;
            case "android":
                System.out.println(PhoneModel.HUAWEI + "      " + PhoneModel.HUAWEI.getOs());
                System.out.println(PhoneModel.PIXEL + "       " + PhoneModel.PIXEL.getOs());
                System.out.println(PhoneModel.SAMSUNG + "     " + PhoneModel.SAMSUNG.getOs());
                System.out.println(PhoneModel.LG + "          " + PhoneModel.LG.getOs());
                break;
            default:
                System.out.println("No Recommendations");
                break;
        }
        scanner.close();
    }
}
