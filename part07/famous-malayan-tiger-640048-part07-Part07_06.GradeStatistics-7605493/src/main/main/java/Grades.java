/**
 * @author bexx
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Grades {
    private ArrayList<Integer> points;
    
    public Grades() {
        this.points = new ArrayList<>();
    }
    
    public void add(int point) {
        if (point >= 0 && point <= 100) {
            points.add(point);
        }
    }
    
    public void pointAverage() {
        int sum = 0;
        int count = 0;
        for (int i: points) {
            sum += i;
            count++;
        }
        System.out.println("Point average (all): " + (double) sum / count);
    }
    
    public void pointAveragePassing() {
        int sum = 0;
        int count = 0;
        for (int i: points) {
            if (i >= 50) {
                sum += i;
                count++;
            }
        }
        
        if (count < 1) {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Point average (passing): " + (double) sum / count);
    }
    
    public void passPercentage() {
        int passing = 0;
        for (int i: points) {
            if (i >= 50) {
                passing++;
            }
        }
        System.out.println("Pass percentage: " + (double) passing / points.size() * 100);
    }
    
    public void gradeDistribution() {
        int fives = 0;
        int fours = 0;
        int threes = 0;
        int twos = 0;
        int ones = 0;
        int zeros = 0;
        for (int i: points) {
            if (i < 50) {
                zeros++;
            } else if (i >= 50 && i < 60) {
                ones++;
            } else if (i >= 60 && i < 70) {
                twos++;
            } else if (i >= 70 && i < 80) {
                threes++;
            } else if (i >= 80 && i < 90) {
                fours++;
            } else if (i >= 90 && i < 100) {
                fives++;
            }
        }
        
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        for (int i = 0; i < fives; i++) {
            System.out.print("*");
        }
        System.out.print("\n4: ");
        for (int i = 0; i < fours; i++) {
            System.out.print("*");
        }
        System.out.print("\n3: ");
        for (int i = 0; i < threes; i++) {
            System.out.print("*");
        }
        System.out.print("\n2: ");
        for (int i = 0; i < twos; i++) {
            System.out.print("*");
        }
        System.out.print("\n1: ");
        for (int i = 0; i < ones; i++) {
            System.out.print("*");
        }
        System.out.print("\n0: ");
        for (int i = 0; i < zeros; i++) {
            System.out.print("*");
        }
    }
}
