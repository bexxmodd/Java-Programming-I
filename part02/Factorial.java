
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int fact = 1;
        
        for (int n = 1; n <= num; n++) {
            fact *= n;
        }
        
        System.out.println("Factorial: " + fact);
    }
}
