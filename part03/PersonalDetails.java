
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int length = 0;
        String name = "";
        
        while (true) {
            
            String users = scanner.nextLine();
            if (users.equals("")) {
                break;
            }
            
            String[] splitz = users.split(",");
            int age = Integer.valueOf(splitz[1]);

            sum += age;
            count++;
            
            if (splitz[0].length() > length) {
                length = splitz[0].length();
                name = splitz[0];
            }
            
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + ((double) sum / count));

    }
}
