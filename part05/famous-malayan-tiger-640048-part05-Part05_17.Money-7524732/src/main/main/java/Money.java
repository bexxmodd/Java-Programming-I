
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        // create a clone of current Money &
        // convert argument to a Money object.
        Money newMoney = new Money(this.euros, this.cents);
        Money newAdd = (Money) addition;
        
        // Extract Euros and Cents from Money objects.
        // If cents >= 100 add to Euros and reset Cents.
        int euros = newMoney.euros() + newAdd.euros();
        int cents = newMoney.cents() + newAdd.cents();
        
        if (cents >= 100) {
            euros++;
            cents = cents - 100;
        }
        
        // Create return object with summed value;
        Money sumMoney = new Money(euros, cents);
        return sumMoney;
    }
    
    public boolean lessThan(Money compared) {
        Money newMoney = new Money(this.euros, this.cents);
        Money newCompare = (Money) compared;
        if (newMoney.euros() < newCompare.euros()) {
            return true;
        }
        
        if (newMoney.euros() > newCompare.euros()) {
            return false;
        }
        
        if (newMoney.cents() < newCompare.cents()) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        // create a clone of current Money &
        // convert argument to a Money object.
        Money newMoney = new Money(this.euros, this.cents);
        Money newMinus = (Money) decreaser;
               
        // Extract Euros and Cents from Money objects.
        // If cents > 100 add to Euros and reset Cents.
        int euros = newMoney.euros() - newMinus.euros();
        int cents = newMoney.cents() - newMinus.cents();
        
        if (cents < 0) {
            euros -= 1;
            cents = 100 + cents;
        }
        
        // New 0 value money object to compare.
        // If the return value is negative return 0.0.
        Money banckrupt = new Money(0, 0);
        Money minusMoney = new Money(euros, cents);
        if (minusMoney.lessThan(banckrupt)) {
            return banckrupt;
        }
        
        return minusMoney;
    }

}
