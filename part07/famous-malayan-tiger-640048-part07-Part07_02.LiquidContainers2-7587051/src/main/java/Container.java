/**
 * @author bexx
 */


public class Container {
    private int container;
    
    public Container() {
        this.container = container;
    }
    
    public int contains() {
        return container;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            container += amount;
            if (container > 100) {
                container = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            container -= amount;
            if (container < 0) {
                container = 0;
            }
        }
    }
    
    public String toString() {
        return container + "/100";
    }
}
