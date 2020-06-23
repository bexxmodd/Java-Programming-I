
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        Boolean found = false;
        
        try (Scanner searchLine = new Scanner(Paths.get(file))) {
            while (searchLine.hasNextLine()) {
                if (searchLine.nextLine().equals(searchedFor)) {
                    System.out.println("Found!");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Not found.");
            }
        }
        catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
