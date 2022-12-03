package Day16_11_20.homework.MEDIUM;

import java.util.ArrayList;

public class SchoolService {
    public int getTotalNumberOfSchoolsInAllTowns(ArrayList<Town> towns) {
        int totalSchools = 0;
        for (Town town : towns) {
            totalSchools += town.getSchools().size();
        }

        return totalSchools;
    }

    public ArrayList<School> getSchoolWithLowestAmountOfGroups(ArrayList<Town> towns) {
        ArrayList<School> schoolWithLowestAmountOfGroups = new ArrayList<>();
        School lowestGroupSchool = towns.get(0).getSchools().get(0);
        int lowestNumberOfGroups = towns.get(0).getSchools().get(0).getGroups().size();
        for (Town town : towns) {
            for (School school : town.getSchools()) {
                if (school != null && school.getGroups().size() < lowestNumberOfGroups) {
                    lowestGroupSchool = school;
                }
            }
        }

        schoolWithLowestAmountOfGroups.add(lowestGroupSchool);
        return schoolWithLowestAmountOfGroups;
    }

    public ArrayList<School> getSchoolsStartingWithAddress(ArrayList<School> schools, String givenPartOfAddress) {
        ArrayList<School> schoolsMatchesGivenAddress = new ArrayList<>();
        for (School school : schools) {
            // school.setAdress(school.getAdress().toLowerCase());
            String adreess = school.getAdress();
            if (adreess.startsWith(givenPartOfAddress)) {
                schoolsMatchesGivenAddress.add(school);
            }
            ;

        }
        return schoolsMatchesGivenAddress;
    }
}
