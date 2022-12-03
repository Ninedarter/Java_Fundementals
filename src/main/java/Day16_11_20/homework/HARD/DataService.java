package Day16_11_20.homework.HARD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataService {


    public List<Person> getAllPeopleByGivenPartOfName(List<Person> people, String partOfString) {
        List<Person> peopleToFind = new ArrayList<>();

        for (Person onePerson : people) {
            if (nameMatchesGivenPartOfAName(partOfString, onePerson)) {
                peopleToFind.add(onePerson);
            }
        }
        return peopleToFind;
    }

    public ArrayList<Person> findPeopleOlderThanGivenDate(List<Person> people, String givenDate) {
        LocalDate givenDateFormatted = LocalDate.parse(givenDate);
        ArrayList<Person> peopleOlderThanGivenDate = new ArrayList<>();
        for (Person person : people) {
            LocalDate personBirthDate = LocalDate.parse(person.getDateOfBirth());
            if (personIsOlderThanGivenDate(givenDateFormatted, person, personBirthDate)) {
                peopleOlderThanGivenDate.add(person);
            }
        }
        return peopleOlderThanGivenDate;
    }

    public ArrayList<Person> getAllPeopleByGivenCity(List<Person> people, String givenCity) {
        ArrayList<Person> peopleLivesInGivenCity = new ArrayList<>();
        for (Person person : people) {
            if (person.getAddress().getCity() != null && person.getAddress().getCity().equalsIgnoreCase(givenCity)){
                peopleLivesInGivenCity.add(person);
            }
        }
return peopleLivesInGivenCity;
    }

    private static boolean personIsOlderThanGivenDate(LocalDate givenDateFormatted, Person person, LocalDate personBirthDate) {
        return person.getDateOfBirth() != null && personBirthDate.isAfter(givenDateFormatted);
    }


    private static boolean nameMatchesGivenPartOfAName(String partOfString, Person onePerson) {
        return onePerson.getName() != null && onePerson.getName().toLowerCase().startsWith(partOfString.toLowerCase());
    }
}
