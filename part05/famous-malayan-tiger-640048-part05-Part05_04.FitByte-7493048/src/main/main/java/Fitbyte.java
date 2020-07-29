/**
 * @author bexx
 */
public class Fitbyte {
    private int age;
    private int restHR;
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restHR = restingHeartRate;
    }
    public double targetHeartRate(double percentageOfMaximum) {
        double maxHR = 206.3 - (0.711 * this.age);
        return (maxHR - this.restHR) * percentageOfMaximum + this.restHR;
    }
    
}
