/**
 * @author bexx
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Stack {
    private ArrayList<String> example;
    
    public Stack() {
        this.example = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (this.example.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
        this.example.add(value);
    }
    
    public ArrayList<String> values() {
        return this.example;
    }
    
    public String take() {
        String topValue = this.example.get(this.example.size() - 1);
        this.example.remove(topValue);
        return topValue;
    }
}
