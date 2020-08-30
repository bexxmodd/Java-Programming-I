/**
 * @author bexx
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class UserInterface {
    private TodoList aList;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.aList = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("To add: ");
                String addtoList = scanner.nextLine();
                aList.add(addtoList);
            } else if (command.equals("list")) {
                aList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                aList.remove(number);
            }    
        }
    }
}
