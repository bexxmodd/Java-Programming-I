/**
 * @author bexx
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager manager;
    private Scanner scan;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scan = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke\n2 - draw a joke\n3 - list jokes \nX - stop");
            String userInput = scan.nextLine();
            
            if (userInput.equals("X")) {
                break;
            }
            
            if (userInput.equals("1")) {
                System.out.println("Write the joke to be added:");
                String userJoke = scan.nextLine();
                manager.addJoke(userJoke);
            }
            
            if (userInput.equals("2")) {
                String aJoke = manager.drawJoke();
                System.out.println(aJoke);
            }
            
            if (userInput.equals("3")) {
                System.out.println("Printing the jokes.");
                manager.printJokes();
            }
        }
    }
}
