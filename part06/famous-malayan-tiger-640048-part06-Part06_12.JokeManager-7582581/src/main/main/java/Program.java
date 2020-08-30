
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface main = new UserInterface(manager, scanner);
        main.start();
    }
}
