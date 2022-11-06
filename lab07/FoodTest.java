import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
        Food pizza1 = new Food();
        pizza1.setId(1);
        pizza1.setName("pizza");
        pizza1.setType("Seafood");
        pizza1.setSize(11);
        pizza1.setPrice(12);
        Food pizza2 = new Food();
        pizza2.setId(2);
        pizza2.setName("pizza");
        pizza2.setType("Beef");
        pizza2.setSize(9);
        pizza2.setPrice(10);
        Food Fried_Rice = new Food();
        Fried_Rice.setId(3);
        Fried_Rice.setName("fried rice");
        Fried_Rice.setType("Seafood");
        Fried_Rice.setSize(5);
        Fried_Rice.setPrice(12);
        Food Noodles = new Food();
        Noodles.setId(4);
        Noodles.setName("noodles");
        Noodles.setType("Beef");
        Noodles.setSize(6);
        Noodles.setPrice(14);

        System.out.println(pizza1.getType() + " " + pizza1.getName() + ": (" + pizza1.getSize() +" Inches) " + pizza1.getPrice() + " $");
        System.out.println(pizza2.getType() + " " + pizza2.getName() + ": (" + pizza2.getSize() +" Inches) " + pizza2.getPrice() + " $");
        System.out.println(Fried_Rice.getType() + " " + Fried_Rice.getName() + ": (" + Fried_Rice.getSize() +" Inches) " + Fried_Rice.getPrice() + " $");
        System.out.println(Noodles.getType() + " " + Noodles.getName() + ": (" + Noodles.getSize() +" Inches) " + Noodles.getPrice() + " $");
    }
}
