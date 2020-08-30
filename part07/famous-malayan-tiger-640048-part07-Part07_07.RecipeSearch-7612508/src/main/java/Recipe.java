/**
 * @author bexx
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {
    private String name;
    private int time;
    private List<String> ingredients;
    
    public Recipe(String name, int time) {
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }
    
    public String toString() {
        return name + ", cooking time: " + time;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
        return this.time;
    }
    
    public List<String> getIngr() {
        return this.ingredients;
    }
    
    public void addIngr(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setTime(int time) {
        this.time = time;
    }
    
    public void setIngr(List<String> ingr) {
        this.ingredients = ingr;
    }
    
}
