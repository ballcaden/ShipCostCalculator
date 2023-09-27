import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double initPrice;
        double shippingCost;
        double finalPrice;

        System.out.println("Please enter your item's price: ");
        initPrice = scan.nextDouble();

        if (initPrice >= 100) {
            System.out.println("Your shipping is free! Your total is $" + initPrice);
        } else {
          shippingCost = initPrice * 0.02;
          finalPrice = initPrice + shippingCost;
          System.out.println("Your shipping is not free. The total cost of your item is " + finalPrice + "$");
        }
    }
}