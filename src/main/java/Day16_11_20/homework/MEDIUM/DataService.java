package Day16_11_20.homework.MEDIUM;

import java.util.ArrayList;

public class DataService {
    /**
     * This method compares all towns population in the List.
     *
     * @param towns ArrayList of towns to compare
     * @return biggest town name and population as String ArrayList
     */
    public Town getBiggestTown(ArrayList<Town> towns) {
        Town biggestCity = towns.get(0);
        for (Town town : towns) {
            if (town.getPopulation() > biggestCity.getPopulation()) {
                biggestCity = town;
            }
        }
        return biggestCity;
    }

    public ArrayList<Town> getTownsFromGivenCountry(ArrayList<Town> towns, String givenCountry) {
        ArrayList<Town> townsFromSpecificCountry = new ArrayList<>();
        for (Town town : towns) {
            if (town != null && town.getCountry().equalsIgnoreCase(givenCountry)) {
                townsFromSpecificCountry.add(town);
            }
        }
        return townsFromSpecificCountry;
    }

    public ArrayList<Town> getTownWithMostSchools(ArrayList<Town> towns) {
        Town mostSchoolsAtTown = towns.get(0);
        int biggestNumberOfSchoolAtTown = mostSchoolsAtTown.getSchools().size();
        for (Town town : towns) {
            int numberOfSchools = town.getSchools().size();
            if (comparableTownHasMostSchools(biggestNumberOfSchoolAtTown, town, numberOfSchools)) {
                mostSchoolsAtTown = town;
            }
        }
        ArrayList<Town> townWithMostSchools = new ArrayList<>();
        townWithMostSchools.add(mostSchoolsAtTown);
        return townWithMostSchools;
    }

    private static boolean comparableTownHasMostSchools(int biggestNumberOfSchoolAtTown, Town town, int numberOfSchools) {
        return town != null & town.getName() != null && numberOfSchools > biggestNumberOfSchoolAtTown;
    }
}
