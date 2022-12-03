package Day16_11_20.homework.MEDIUM;

import day14_1113_homework.Movie;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SchoolServiceTest {

    @BeforeClass
    public static ArrayList<Town> getSampleDataForTowns() {

        Group group1 = new Group();
        Group group2 = new Group();
        ArrayList<Group> groupsAtSchool1 = new ArrayList<>();
        groupsAtSchool1.add(group1);
        groupsAtSchool1.add(group2);
        School school1 = new School();
        school1.setName("Adamkaus gimnazija");
        school1.setAdress("Basanaviciaus g. 23");
        school1.setGroups(groupsAtSchool1);


        Group group3 = new Group();
        ArrayList<Group> groupsAtSchool2 = new ArrayList<>();
        groupsAtSchool2.add(group3);
        School school2 = new School();
        school2.setGroups(groupsAtSchool2);
        school2.setName("Maironio gimnazija");
        school2.setAdress("Partizanu g. 45");


        ArrayList<School> schoolsAtTown1 = new ArrayList<>();
        schoolsAtTown1.add(school1);
        schoolsAtTown1.add(school2);
        Town town1 = new Town();
        town1.setSchools(schoolsAtTown1);


        Group group4 = new Group();
        Group group5 = new Group();
        Group group6 = new Group();
        ArrayList<Group> groupsAtSchool3 = new ArrayList<>();
        groupsAtSchool3.add(group4);
        groupsAtSchool3.add(group5);
        groupsAtSchool3.add(group6);
        School school3 = new School();
        school3.setGroups(groupsAtSchool3);
        school3.setName("Dariaus ir Gireno Gimnazija");
        school3.setAdress("Basanaviciaus g.44");

        ArrayList<School> schoolsAtTown2 = new ArrayList<>();
        schoolsAtTown2.add(school3);

        Town town2 = new Town();
        town2.setSchools(schoolsAtTown2);
        ArrayList<Town> towns = new ArrayList<>();
        towns.add(town1);
        towns.add(town2);

        return towns;

    }

    SchoolService schoolService = new SchoolService();

    @Test
    void getTotalNumberOfSchoolsInAllTowns() {
        int totalNumberOfSchools = schoolService.getTotalNumberOfSchoolsInAllTowns(getSampleDataForTowns());
        assertEquals(3, totalNumberOfSchools); //ar blogas metodas,kad eina patestuoti tik dydi? bet metodas to ir praso
    }

    @Test
    void getSchoolWithLowestAmountOfGroups() {

        ArrayList<School> lowestGroupSchool = schoolService.getSchoolWithLowestAmountOfGroups(getSampleDataForTowns());
        assertEquals("Maironio gimnazija", lowestGroupSchool.get(0).getName());
        assertEquals(1, lowestGroupSchool.get(0).getGroups().size());


    }

    @Test
    void getSchoolsStartingWithAddress() {
        ArrayList<School> allSchools = getSampleDataForTowns().get(0).getSchools();
        allSchools.add(getSampleDataForTowns().get(1).getSchools().get(0));

        ArrayList<School> schoolsStartingWithSpecificAddress = schoolService.getSchoolsStartingWithAddress(allSchools, "Basan");
        assertEquals(2, schoolsStartingWithSpecificAddress.size());
        assertEquals("Basanaviciaus g. 23", schoolsStartingWithSpecificAddress.get(0).getAdress());

    }
}