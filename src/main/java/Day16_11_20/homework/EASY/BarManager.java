package Day16_11_20.homework.EASY;

import java.util.ArrayList;

public class BarManager {
    /**
     * Checks all bartenders and compares experiences.
     *
     * @param bartenders
     * @return ArrayList of most experiencedBartender
     */
    public ArrayList<Bartender> findMostExperiencedBartender(ArrayList<Bartender> bartenders) {
        ArrayList<Bartender> mostExperiencedBartender = new ArrayList<>();
        Bartender mostExperienced = new Bartender();
        for (Bartender specificBartender : bartenders) {
            if (specificBartender.getExperienceInYears() > mostExperienced.getExperienceInYears()) {
                mostExperienced = specificBartender;
            }
        }

        for (Bartender specificBartender : bartenders) {
            if (specificBartender.getExperienceInYears() == mostExperienced.getExperienceInYears()) {
                mostExperiencedBartender.add(mostExperienced);
            }
        }

        return mostExperiencedBartender;
    }

    public ArrayList<Bartender> findMostExpensiveBartender(ArrayList<Bartender> bartenders) {
        ArrayList<Bartender> mostExpensiveBartender = new ArrayList<>();
        Bartender mostExpensive = new Bartender();
        for (Bartender specificBartender : bartenders) {
            if (specificBartender.getSalary() > mostExpensive.getSalary()) {
                mostExpensive = specificBartender;
            }
        }
        for (Bartender specificBartender : bartenders) {
            if (specificBartender.getSalary() == mostExpensive.getSalary()) {
                mostExpensiveBartender.add(specificBartender);
            }
        }
        return mostExpensiveBartender;
    }

    public ArrayList<Bartender> findBartenderWithLowestExperience(ArrayList<Bartender> bartenders) {
        ArrayList<Bartender> lowestExperienced = new ArrayList<>();
        Bartender lowestExperiencedBartender = bartenders.get(0);

        for (Bartender specificBartender : bartenders) {
            if (specificBartender.getPreviousWorkedBars().size() < lowestExperiencedBartender.getPreviousWorkedBars().size()) {
                lowestExperiencedBartender = specificBartender;
            }
        }
        for (Bartender specificBartender : bartenders) {
            if (specificBartender.getPreviousWorkedBars().size() == lowestExperiencedBartender.getPreviousWorkedBars().size()) {
                lowestExperienced.add(specificBartender);
            }
        }
        return lowestExperienced;
    }


}
