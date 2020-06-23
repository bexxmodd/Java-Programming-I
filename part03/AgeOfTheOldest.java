
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int holder = 0;
        
        while (true) {
            String users = scanner.nextLine();
            
            if (users.equals("")) {
                break;
            }
            
            String[] splitz = users.split(",");
            
            int oldest = Integer.valueOf(splitz[1]);
            
            if (oldest > holder) {
                holder = oldest;
            }
            
        }
        
        System.out.println("Age of the oldes: " + holder);

    }
}
