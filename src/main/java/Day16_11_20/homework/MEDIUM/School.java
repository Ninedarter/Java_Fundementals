package Day16_11_20.homework.MEDIUM;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class School {

    private String name;
    private String adress;
    private String pricipal;
    private ArrayList<Group> groups;


    public ArrayList<Group> createGroups(int groupsToCreate) {
        Group group = new Group();
        Faker faker = new Faker();
        ArrayList<Group> groups = new ArrayList<>();
        for (int i = 0; i < groupsToCreate; i++) {
            String name = "Group" + i;
            int studentsToCreate = faker.number().numberBetween(3, 10);
            ArrayList<Student> studentsAtGroup = group.createAtLeast3Students(studentsToCreate);
            Group createdGroup = new Group(name, studentsAtGroup);
            groups.add(createdGroup);
        }
        return groups;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getPricipal() {
        return pricipal;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricipal(String pricipal) {
        this.pricipal = pricipal;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", pricipal='" + pricipal + '\'' +
                ", groups=" + groups +
                '}';
    }
}
