
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter count = new Counter(3);
        count.increase();
        System.out.println(count.value());
    }
}
