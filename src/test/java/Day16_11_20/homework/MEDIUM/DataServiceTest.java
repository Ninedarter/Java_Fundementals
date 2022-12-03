package Day16_11_20.homework.MEDIUM;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DataServiceTest {


    @Test
    void getBiggestTown() {
        DataService dataService = new DataService();
        Town smallestTown = new Town();
        smallestTown.setPopulation(10);
        Town averageTown = new Town();
        averageTown.setPopulation(100);
        Town biggestTown = new Town();
        biggestTown.setPopulation(200);
        biggestTown.setName("RadVegas");

        ArrayList<Town> towns = new ArrayList<>();
        towns.add(smallestTown);
        towns.add(averageTown);
        towns.add(biggestTown);

        Town actualBiggestTown = dataService.getBiggestTown(towns);
        assertEquals("RadVegas", actualBiggestTown.getName());
        assertEquals(200, actualBiggestTown.getPopulation());
    }

    @Test
    void shouldGetTownsFromSpecificCountry_WhenSpecificCountryIsGiven() {

        DataService dataService = new DataService();
        Town lithuanianTown = new Town();
        lithuanianTown.setName("RadVegas");
        lithuanianTown.setCountry("Lithuania");
        Town lithuanianTown2 = new Town();
        lithuanianTown2.setName("Kaunas");
        lithuanianTown2.setCountry("Lithuania");
        Town americanTown = new Town();
        americanTown.setName("Miami");
        americanTown.setCountry("USA");
        ArrayList<Town> allTowns = new ArrayList<>();
        allTowns.add(lithuanianTown);
        allTowns.add(americanTown);
        allTowns.add(lithuanianTown2);
        ArrayList<Town> townsFromLithuania = dataService.getTownsFromGivenCountry(allTowns, "Lithuania");
        assertEquals(2, townsFromLithuania.size());
        assertEquals("RadVegas", townsFromLithuania.get(0).getName());
        assertEquals("Kaunas", townsFromLithuania.get(1).getName());
        assertEquals("Lithuania", townsFromLithuania.get(0).getCountry());
        assertEquals("Lithuania", townsFromLithuania.get(1).getCountry());
    }

    @Test
    void shouldFindTownWithMostSchools() {

        ArrayList<School> schools = new ArrayList<>();
        School school1 = new School();
        schools.add(school1);

        ArrayList<School> schools2 = new ArrayList<>();
        School school2 = new School();
        school2.setName("Adamkaus gimnazija");
        School school3 = new School();
        school3.setName("Maironio gimnazija ");
        schools2.add(school2);
        schools2.add(school3);

        Town townWith1School = new Town();
        townWith1School.setSchools(schools);
        townWith1School.setName("Kaunas");
        Town townWith2Schools = new Town();
        townWith2Schools.setSchools(schools2);
        townWith2Schools.setName("Vilnius");
        DataService dataService = new DataService();
        ArrayList<Town> allTowns = new ArrayList<>();
        allTowns.add(townWith1School);
        allTowns.add(townWith2Schools);
        ArrayList<Town> townWithBiggestNumberOfSchools = dataService.getTownWithMostSchools(allTowns);
        assertEquals(2, townWithBiggestNumberOfSchools.get(0).getSchools().size());
        assertEquals("Vilnius", townWithBiggestNumberOfSchools.get(0).getName());

    }

    @Test
    void shouldFindTotalNumberOfSchoolsInAllTowns() {
        ArrayList<School> schools = new ArrayList<>();
        School school1 = new School();
        schools.add(school1);

        ArrayList<School> schools2 = new ArrayList<>();
        School school2 = new School();
        school2.setName("Adamkaus gimnazija");
        School school3 = new School();
        school3.setName("Maironio gimnazija ");
        schools2.add(school2);
        schools2.add(school3);

        Town townWith1School = new Town();
        townWith1School.setSchools(schools);
        townWith1School.setName("Kaunas");
        Town townWith2Schools = new Town();
        townWith2Schools.setSchools(schools2);
        townWith2Schools.setName("Vilnius");

        ArrayList<Town> allTowns = new ArrayList<>();
        allTowns.add(townWith1School);
        allTowns.add(townWith2Schools);
        SchoolService schoolService = new SchoolService();
        int totalNumberOfSchools = schoolService.getTotalNumberOfSchoolsInAllTowns(allTowns);
        assertEquals(3, totalNumberOfSchools);

    }
}