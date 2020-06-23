/**
 *
 * @author bexx
 */
public class Books {
    private String title;
    private int pages;
    private int published;
    
    public Books(String title, int pages, int published) {
        this.title = title;
        this.pages = pages;
        this.published = published;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.published;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getPublished() {
        return this.published;
    }
}
