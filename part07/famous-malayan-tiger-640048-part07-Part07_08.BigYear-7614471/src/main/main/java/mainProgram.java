
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        BirdCage birdCage = new BirdCage();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                Bird bird = new Bird(name, latinName);
                birdCage.addBird(bird);
            }
            
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String one = scan.nextLine();
                birdCage.printBird(one);
            }
            
            if (command.equals("All")) {
                birdCage.printAllBirds();
            }
            
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String word = scan.nextLine();
                birdCage.addObsToABird(word);
            }
        }

    }

}
