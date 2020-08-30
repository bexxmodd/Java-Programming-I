/**
 * @author bexx
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        list.add(task);
    }
    
    public void print() {
        for (String item: list) {
            System.out.println((list.indexOf(item) + 1) + ": " + item);
        }
    }
    
    public void remove(int number) {
        list.remove(number - 1);
    }
}
