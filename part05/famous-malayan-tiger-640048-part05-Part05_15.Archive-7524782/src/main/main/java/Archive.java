/**
 * @author bexx
 */
public class Archive {
    private String name;
    private String identifier;
    
    public Archive(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
