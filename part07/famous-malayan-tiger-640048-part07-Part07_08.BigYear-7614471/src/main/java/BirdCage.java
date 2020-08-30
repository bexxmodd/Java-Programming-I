/**
 * @author bexx
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BirdCage {
    
    private ArrayList<Bird> birds;
    
    public BirdCage() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        birds.add(bird);
    }
    
    public void printBird(String searchWord) {
        for (Bird i: birds) {
            if (i.getName().equals(searchWord)) {
                System.out.println(i.toString());
            }
        }
    }
    
    public void printAllBirds() {
        for (Bird i: birds) {
            System.out.println(i.toString());
        }
    }
    
    public void addObsToABird(String word) {
        int count = 0;
        for (Bird i: birds) {
            if (i.getName().equals(word)) {
                i.addObservation();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not a bird!");
        }
    }
}
