/**
 *
 * @author bexx
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        this.value = 0;
    }
    
    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }
    
    public void decrease() {
        if (this.value > 1) {
            this.value -= 1;
        }
    }
    
    public int value() {
        return this.value;
    }
    
    public boolean full() {
        return this.value == 5;
    }
    
}
