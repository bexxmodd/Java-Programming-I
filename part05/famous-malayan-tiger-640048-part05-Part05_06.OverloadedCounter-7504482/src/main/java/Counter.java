/**
 * @author bexx
 */
public class Counter {
    private int startValue;
    
    public Counter() {
        this.startValue = 0;
    }
    
    public Counter(int startValue) {
        this.startValue = startValue;
    }
    
    public void increase() {
        this.startValue++;
    }
    
    public void decrease() {
        this.startValue -= 1;
    }
    
    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.startValue = this.startValue + increaseBy;
        }
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.startValue = this.startValue - decreaseBy;
        }
    }
    
    public int value() {
        return startValue;
    }
}
