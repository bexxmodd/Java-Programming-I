
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int i: array) {
            for (int s =0; s < i; s++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
