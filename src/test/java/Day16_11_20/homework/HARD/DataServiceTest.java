package Day16_11_20.homework.HARD;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataServiceTest {
    DataService dataService = new DataService();
    @Test
    void getAllPeopleByGivenPartOfName() {
        Person person1 = new Person();
        person1.setName("Andrius");
        person1.setDateOfBirth("2001-01-15");
        Person person2 = new Person();
        person2.setName("Laima");
        Person person3 = new Person();
        person3.setName("Arunas");
        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        List<Person> actualPeopleByGivenPartName = dataService.getAllPeopleByGivenPartOfName(people,"A");
        assertEquals(2,actualPeopleByGivenPartName.size());
        assertEquals("Andrius",actualPeopleByGivenPartName.get(0).getName());
        assertEquals("2001-01-15",actualPeopleByGivenPartName.get(0).getDateOfBirth());

    }

    @Test
    void findPeopleOlderThanGivenDate() {
        Person person1 = new Person();
        person1.setName("Andrius");
        person1.setDateOfBirth("2001-01-15");
        Person person2 = new Person();
        person2.setName("Laima");
        person2.setDateOfBirth("1985-11-07");
        Person person3 = new Person();
        person3.setName("Arunas");
        person3.setDateOfBirth("2006-01-18");
        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        ArrayList<Person> peopleBornAfter =dataService.findPeopleOlderThanGivenDate(people,"2002-01-01");
        assertEquals(1, peopleBornAfter.size());
        assertEquals("2006-01-18",peopleBornAfter.get(0).getDateOfBirth());
        assertEquals("Arunas",peopleBornAfter.get(0).getName());
    }

    @Test
    void getAllPeopleByGivenCity() {
       Person person1 = new Person();
        person1.setName("Andrius");
        Address person1Address = new Address();
        person1Address.setCity("Kaunas");
        person1.setAddress(person1Address);
        Person person2 = new Person();
        person2.setName("Laima");
        Address person2Address = new Address();
        person2Address.setCity("RadVegas");
        person2.setAddress(person2Address);
        Person person3 = new Person();
        person3.setName("Arunas");
        Address person3Address = new Address();
        person3Address.setCity("Kaunas");
        person3.setAddress(person3Address);
        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        ArrayList<Person> peopleWhoLivesInKaunas = dataService.getAllPeopleByGivenCity(people,"Kaunas");
        assertEquals(2,peopleWhoLivesInKaunas.size());
        assertEquals("Kaunas",peopleWhoLivesInKaunas.get(0).getAddress().getCity());


    }
}