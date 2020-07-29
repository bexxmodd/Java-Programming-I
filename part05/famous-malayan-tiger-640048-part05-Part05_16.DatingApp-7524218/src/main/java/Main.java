
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate someDate = new SimpleDate(24, 12, 1987);
        System.out.println(someDate);
        someDate.advance(15);
        System.out.println(someDate);
        
        SimpleDate something = someDate.afterNumberOfDays(45);
        System.out.println(something);
    }
}
