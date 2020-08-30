
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String [] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                if (first + amount <= 100 && amount > 0) {
                    first += amount;
                } else if (first + amount > 100 && amount > 0) {
                    first = 100;
                }
            }
            
            if (command.equals("move")) {
                if (amount > 0 && amount <= first) {
                    first -= amount;
                    second += amount;
                    if (second > 100) {
                        second = 100;
                    }
                } else if (amount > 0 && amount > first) {
                    second += first;
                    first = 0;
                    if (second > 100) {
                        second = 100;
                    }
                }
            }
            
            if (command.equals("remove")) {
                if (amount > 0 && amount <= second) {
                    second -= amount;
                } else if (amount > 0 && amount > second) {
                    second = 0;
                }
            }

        }
    }

}
