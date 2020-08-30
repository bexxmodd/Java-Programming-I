/**
 * @author bexx
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        if (this.people.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }
        
        Person shortest = people.get(0);
        
        for (Person pup: people) {
            if (pup.getHeight() < shortest.getHeight()) {
                shortest = pup;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (people.isEmpty()) {
            return null;
        }
        
        Person shortest = this.shortest();
        this.people.remove(shortest);
        return shortest;
    }
}
