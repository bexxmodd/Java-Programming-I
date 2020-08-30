
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Grades grades = new Grades();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int userPoint = Integer.valueOf(scanner.nextLine());
            
            if (userPoint == -1) {
                break;
            }
            
            grades.add(userPoint);
        }
        
        grades.pointAverage();
        grades.pointAveragePassing();
        grades.passPercentage();
        grades.gradeDistribution();
        
    }
}
