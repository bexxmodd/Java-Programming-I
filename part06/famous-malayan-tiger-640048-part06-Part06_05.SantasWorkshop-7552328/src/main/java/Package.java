/**
 * @author bexx
 */
import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> collection;
    
    public Package() {
        this.collection = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.collection.add(gift);
    }
    
    public int totalWeight() {
        int total = 0;
        for (Gift g: collection) {
            total += g.getWeight();
        }
        return total;
    }
}
