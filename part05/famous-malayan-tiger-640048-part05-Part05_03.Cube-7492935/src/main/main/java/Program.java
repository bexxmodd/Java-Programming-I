
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        int size = Integer.valueOf(scanner.nextLine());
        Cube newCube = new Cube(size);
        System.out.println(newCube.volume());
        System.out.println(newCube);
    }
}
