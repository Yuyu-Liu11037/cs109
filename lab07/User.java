import java.util.Scanner;

public class User {
    private String account;
    private String password;
    private double money;

    public void setUser(String account){
        this.account = account;
    }

    public String getUser(){
        return account;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public double getMoney(){
        return money;
    }

    public void expense(double value, Scanner in){
        if(money >= value){
            this.money -= value;
            System.out.println("You have expense "+value+" dollar and the remained amount is "+(money-value));
        } else {
            System.out.println("no sufficient funds");
        }
    }

    public void income(double value){
        this.money += value;
        System.out.println("The remained amount is " + money);
    }

    public void introduce(){
        System.out.println("My name is " + this.account + " and I have " + this.money + " dollar");
    }

}
