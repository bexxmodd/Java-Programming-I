
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine());
        for (int n = 0; n < num + 1; n++) {
            System.out.println(n); 
        }

    }
}
