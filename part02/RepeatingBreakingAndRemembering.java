
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int positives = 0;
        int numnums = 0;
        int avgs = 0;
        int evens = 0;
        
        while (true) {
            System.out.println("Give numbers:");
            int nums = Integer.valueOf(scanner.nextLine());
            
            if (nums == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            if (nums > 0) {
                positives += nums;
                numnums++;
            }
            
            if (nums % 2 == 0) {
                evens++;
            }
        }
        
        System.out.println("Sum: " + positives);
        System.out.println("Numbers: " + numnums);
        System.out.println("Average: " + ((double) positives / numnums));
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + (numnums - evens));
        
    }
}
