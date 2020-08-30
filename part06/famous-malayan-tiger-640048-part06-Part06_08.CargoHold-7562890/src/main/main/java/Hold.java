/**
 * @author bexx
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> baggage;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.baggage = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase i: baggage) {
            totalWeight += i.totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() <= maxWeight) {
            baggage.add(suitcase);
        }
    }
    
    public String toString() {
        int totalWeight = 0;
        for (Suitcase i: baggage) {
            totalWeight += i.totalWeight();
        }
        return baggage.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase i: baggage) {
            i.printItems();
        }
    }
}
