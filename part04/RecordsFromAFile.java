
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner csv = new Scanner(Paths.get(file))) {
            while (csv.hasNextLine()) {
                String line = csv.nextLine();
                String[] parts = line.split(",");
                System.out.println(parts[0] + ", age: " + parts[1] + " years");
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
