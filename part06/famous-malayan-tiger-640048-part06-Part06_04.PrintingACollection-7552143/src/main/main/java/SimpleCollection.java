
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        String all = "";
        
        if (this.elements.size() == 1) {
            for (String element: elements) {
                return "The collection " + this.name + " has 1 element:\n" + element;
            }
        }
        
        for (String element: this.elements) {
            all += element + "\n";
        }
        return "The collection " + this.name + " has " + this.elements.size() + " elements:\n" + all;
    }
    
}
