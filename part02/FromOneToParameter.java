

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
    public static void printUntilNumber(int number) {
        for (int n = 1; n <= number; n++) {
            System.out.println(n);
        }
    }

}
