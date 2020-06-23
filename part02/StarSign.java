
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(5);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int c = 1; c <= number; c++) {
            System.out.print("*");
        }

        System.out.println("");

    }

    public static void printSquare(int size) {
        // second part of the exercise
        int count = 1;
        while (count <= size) {

            for (int c = 1; c <= size; c++) {
                System.out.print("*");
            }

            count++;
            System.out.println("");

        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for (int h = 1; h <= height; h++) {

            for (int w = 1; w <= width; w++) {
                System.out.print("*");
            }

            if (h < height) {
                System.out.println("");

            }
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int count = 1; count <= size; count++) {

            for (int c = 1; c <= count; c++) {
                System.out.print("*");
            }

            if (count < size) {
                System.out.println("");

            }
        }
    }
}
