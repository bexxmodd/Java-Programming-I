
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holder = 0;
        String name = "";
        while (true) {
            String users = scanner.nextLine();
            
            if (users.equals("")) {
                break;
            }
            
            String[] splitz = users.split(",");
            
            int oldest = Integer.valueOf(splitz[1]);
            
            if (oldest > holder) {
                holder = oldest;
                name = splitz[0];
            }
        }
        
        System.out.println("Name of the oldes: " + name);

    }
}
