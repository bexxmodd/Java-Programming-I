
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int getSquares() {
        return this.squares;
    }
    
    public int getPrice() {
        return this.squares * this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.getSquares() > compared.getSquares()) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        if (this.getPrice() >= compared.getPrice()) {
            return this.getPrice() - compared.getPrice();
        } else {
            return compared.getPrice() - this.getPrice();
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            return true;
        } else {
            return false;
        }
    }
}
