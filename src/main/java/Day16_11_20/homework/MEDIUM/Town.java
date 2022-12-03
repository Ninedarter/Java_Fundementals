package Day16_11_20.homework.MEDIUM;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
public class Town {

    private String name;
    private int population;
    private String country;
    private int yearEstablished;
    private ArrayList<School> schools;


    public ArrayList<School> createSchools(int schoolsToCreate) {
        Faker faker = new Faker();
        School school = new School();
        ArrayList<School> schoolsCreated = new ArrayList<>();
        for (int i = 0; i < schoolsToCreate; i++) {
            String name = faker.university().name();
            String adress = faker.address().streetAddress();
            String principal = faker.name().fullName();
            int groupsToCreate = faker.number().numberBetween(2, 6);
            ArrayList<Group> groups = school.createGroups(groupsToCreate);
            School schoolCreated = new School(name, adress, principal, groups);
            schoolsCreated.add(schoolCreated);
        }
        return schoolsCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public ArrayList<School> getSchools() {
        return schools;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSchools(ArrayList<School> schools) {
        this.schools = schools;
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                ", yearEstablished=" + yearEstablished +
                ", schools=" + schools +
                '}';
    }
}
