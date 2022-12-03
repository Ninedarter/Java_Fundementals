package Day16_11_20.homework.HARD;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HardMain {
    public static void main(String[] args) throws ParseException {
        ConvertJsonToArrayList convertJsonToArrayList = new ConvertJsonToArrayList();

        List<Person> peopleData = convertJsonToArrayList.getDataFromJson();
        DataService dataService = new DataService();
        List<Person> peopleWithT = dataService.getAllPeopleByGivenPartOfName(peopleData, "T");
        for (Person person : peopleWithT) {
            System.out.println(person.getName());
            System.out.println(person.getDateOfBirth());
        }

        ArrayList<Person> peopleWhoAreBornAfterGivenDate = dataService.findPeopleOlderThanGivenDate(peopleData,"2002-10-10");
        System.out.println("People born after : 2002-10-10");
        for (Person person : peopleWhoAreBornAfterGivenDate) {
            System.out.println(person.getName());
            System.out.println(person.getDateOfBirth());
        }

ArrayList<Person> peopleWhoLivesInGivenCity = dataService.getAllPeopleByGivenCity(peopleData,"George Town");
        System.out.println(peopleWhoLivesInGivenCity.get(0).getName());
        System.out.println(peopleWhoLivesInGivenCity.get(0).getAddress().getCity());
    }
}


