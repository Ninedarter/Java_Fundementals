package Day16_11_20.homework.EASY;

import java.util.ArrayList;

public class BarMain {
    public static void main(String[] args) {

        ArrayList<String> previousTomWorkPlaces = new ArrayList<>();
        previousTomWorkPlaces.add("Taboo");
        previousTomWorkPlaces.add("Dzem pub");
        previousTomWorkPlaces.add("Baliai");

        ArrayList<String> previousBenWorkPlaces = new ArrayList<>();
        previousBenWorkPlaces.add("Taboo");
        previousBenWorkPlaces.add("Dejavu");
        previousBenWorkPlaces.add("Dejavu");

        ArrayList<String> previousRaimisWorkPlaces = new ArrayList<>();
        previousRaimisWorkPlaces.add("Tex Mex");
        previousRaimisWorkPlaces.add("Django");
        previousRaimisWorkPlaces.add("Miesto Sodas");
        previousRaimisWorkPlaces.add("Pilies Sodas");

        ArrayList<String> previousAntanasWorkPlaces = new ArrayList<>();
        previousAntanasWorkPlaces.add("Casa della pasta");
        previousAntanasWorkPlaces.add("Dzem pub");
        previousAntanasWorkPlaces.add("Taboo");
        previousAntanasWorkPlaces.add("Rockenrola");
        previousAntanasWorkPlaces.add("Talluti");


        ArrayList<String> previousPauliusWorkPlaces = new ArrayList<>();
        previousPauliusWorkPlaces.add("Dejavu");
        previousPauliusWorkPlaces.add("Sandelis");

        Bartender tomas = new Bartender("Tomas", 3, 500, previousTomWorkPlaces);
        Bartender benas = new Bartender("Ben", 2, 4500, previousBenWorkPlaces);
        Bartender raimis = new Bartender("Raimis", 1, 4500, previousRaimisWorkPlaces);
        Bartender antanas = new Bartender("Antanas", 5, 1800, previousAntanasWorkPlaces);
        Bartender paulius = new Bartender("Paulius", 3, 2700, previousPauliusWorkPlaces);

        ArrayList<Bartender> bartendersList = new ArrayList<>();
        bartendersList.add(tomas);
        bartendersList.add(benas);
        bartendersList.add(raimis);
        bartendersList.add(antanas);
        bartendersList.add(paulius);


        ArrayList<String> orderedCocktails = new ArrayList<>();
        orderedCocktails.add("Cuba Libre");
        orderedCocktails.add("Gin Tonic");
        orderedCocktails.add("Mimosa");

        ArrayList<Cocktail> madeCockatails = tomas.getDrinks(orderedCocktails);
        System.out.println("Made cocktails" + madeCockatails);
        BarManager barManager = new BarManager();
        System.out.println(barManager.findMostExperiencedBartender(bartendersList));
        System.out.println(barManager.findMostExpensiveBartender(bartendersList));
        System.out.println(barManager.findBartenderWithLowestExperience(bartendersList));


    }
}
