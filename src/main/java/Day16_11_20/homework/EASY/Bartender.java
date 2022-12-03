package Day16_11_20.homework.EASY;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bartender {
    private String name;
    private int experienceInYears;
    private int salary;
    private ArrayList<String> previousWorkedBars;

    public void greetCustomer(String customerName) {
        System.out.println("Hello " + customerName + ". Nice to see you");
    }

    public void tellBarsHeWorked() {
        if (previousWorkedBars.size() != 0) {
            System.out.println("So, I worked in : ");
            for (int i = 0; i < previousWorkedBars.size(); i++) {
                System.out.println(previousWorkedBars.get(i));
            }
        } else {
            System.out.println("It's my first workplace");
        }
    }

    public void tellExperience() {
        System.out.println("If you asked..." +
                "My experience is  " + experienceInYears + " years");
    }


    public ArrayList<Cocktail> getDrinks(ArrayList<String> orderedCocktails) {
        ArrayList<Cocktail> madeCocktails = new ArrayList<>();
        for (String singeCocktail : orderedCocktails) {
            Cocktail cocktail = new Cocktail(singeCocktail);
            madeCocktails.add(cocktail);
        }
        return madeCocktails;
    }
}
