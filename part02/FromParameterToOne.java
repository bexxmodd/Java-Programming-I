

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    
    public static void printFromNumberToOne(int number) {
        for (int n = number; n >= 1; n -= 1) {
            System.out.println(n);
        }
    } 

}
