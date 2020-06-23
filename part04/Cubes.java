
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String user = scanner.nextLine();
            if (user.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(user);
            System.out.println(number * number * number);
        }
    }
}
