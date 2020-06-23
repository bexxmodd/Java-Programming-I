
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("value of the gift?");
        int price = Integer.valueOf(scan.nextLine());
        
        if (price < 5000) {
            System.out.println("No tax!");
        } else if (price >= 5000 && price < 25000) {
            double tax = (double) (price - 5000) * 0.08;
            System.out.println("Tax: " + (100 + tax));
        } else if (price >= 25000 && price < 55000) {
            double tax = (double) (price - 25000) * 0.10;
            System.out.println("Tax: " + (1700 + tax));
        } else if (price >= 55000 && price < 200000) {
            double tax = (double) (price - 55000) * 0.12;
            System.out.println("Tax: " + (4700 + tax));
        } else if (price >= 200000 && price < 1000000) {
            double tax = (double) (price - 200000) * 0.15;
            System.out.println("Tax: " + (22100 + tax));
        } else if (price >= 1000000) {
            double tax = (double) (price - 1000000) * 0.17;
            System.out.println("Tax: " + (142100 + tax));
        }
    }
}
