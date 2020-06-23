
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int start = Integer.valueOf(scanner.nextLine());
        
        for (int n = start; n < 101; n++) {
            System.out.println(n);
        }
    }
}
