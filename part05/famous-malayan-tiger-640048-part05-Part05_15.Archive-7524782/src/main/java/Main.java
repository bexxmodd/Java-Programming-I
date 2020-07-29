
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> arch = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Archive entry = new Archive(id, name);
            arch.add(entry);
        }
        
        System.out.println("==Items==");
        String first = "";
        for (Archive a: arch) {
            String compare = a.getIdentifier();
            if (!(first.equals(compare))) {
                System.out.println(a);
                first = a.getIdentifier();
            }
        }
    }
}
