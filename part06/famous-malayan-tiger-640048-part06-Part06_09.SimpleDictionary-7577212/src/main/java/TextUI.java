
/*
 * @author bexx
 */
import java.util.Scanner;
        
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String userInput = scanner.nextLine();
            
            if (userInput.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (userInput.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                
                dictionary.add(word, translation);
            } else if (userInput.equals("search")) {
                System.out.print("To be translated: ");
                String request = scanner.nextLine();
                if (dictionary.translate(request) != null) {
                    System.out.println("Translation: " + dictionary.translate(request));
                } else {
                    System.out.println("Word " + request + " was not found");
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
