
public class AdvancedAstrology {

    public static void printStars(int number) {
        
        for (int c = 1; c <= number; c++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int s = 1; s <= number; s++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int stars = 1;
        int spaces = size - 1;
        
        while (stars <= size) {
            printSpaces(spaces);
            printStars(stars);
            stars++;
            spaces -= 1;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int spaces = height -1;

        for (int i = 1; i <= height * 2; i += 2) {
            printSpaces(spaces);
            printStars(i);
            spaces -= 1;
        }
        
        printSpaces(height -2);
        printStars(3);
        printSpaces(height -2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
//        printTriangle(5);
//        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(6);
    }
}
