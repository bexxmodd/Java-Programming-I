
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("");
        System.out.println("Commands:\nlist - list the recipes"
                + "\nstop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
        
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<Recipe> recipesBook = new ArrayList<>();
        
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.equals("")) {
                    lines.add("end");
                    continue;
                }
                
                lines.add(line);
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        lines.add("end");
        
        String name = "";
        int time = 0;
        ArrayList<String> ingreds = new ArrayList<>();
        
        for (String word: lines) {
            if (word.equals("end")) {
                Recipe newRecipe = new Recipe(name, time);
                for (String r: ingreds) {
                    newRecipe.addIngr(r);
                }
                recipesBook.add(newRecipe);
                ingreds.clear();
            }
            
            if (Character.isUpperCase(word.charAt(0))) {
                name = word;
            } else if (isInteger(word)) {
                time = Integer.valueOf(word);
            } else if (word != "end") {
                ingreds.add(word);
            }
        }
        
        // User Commands
        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe r: recipesBook) {
                    System.out.println(r);
                }
                System.out.println("");
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchByName = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe r: recipesBook) {
                    if (r.getName().contains(searchByName)) {
                        System.out.println(r);
                    }
                }
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                for (Recipe r: recipesBook) {
                    if (r.getTime() <= maxCookingTime) {
                        System.out.println(r);
                    }
                }                
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingred = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe r: recipesBook) {
                    for (String i: r.getIngr()) {
                        if (i.equals(ingred)) {
                            System.out.println(r);
                        }
                    }
                }
            }
        }
    }
    
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e) {
            return false;
        }

    }
}
