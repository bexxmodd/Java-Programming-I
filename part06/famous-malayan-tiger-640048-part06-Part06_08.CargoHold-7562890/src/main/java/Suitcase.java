/**
 * @author bexx
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item i: items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
    
    public void addItem(Item item) {
        int totalWeight = this.totalWeight();
        if (totalWeight + item.getWeight() <= maxWeight) {
            items.add(item);            
        }
    }
    
    public String toString() {
        int totalWeight = this.totalWeight();
        if (items.isEmpty()) {
            return "no items (" + totalWeight + " kg)";
        }
        
        if (items.size() == 1) {
            return items.size() + " item (" + totalWeight + " kg)"; 
        }
        
        return items.size() + " items (" + totalWeight + " kg)"; 
    }
    
    public void printItems() {
        for (Item i: items) {
            System.out.println(i);
        }
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item haviest = items.get(0);
        for (Item i: items) {
            if (haviest.getWeight() < i.getWeight()) {
                haviest = i;
            }            
        }
        return haviest;
    }
}
