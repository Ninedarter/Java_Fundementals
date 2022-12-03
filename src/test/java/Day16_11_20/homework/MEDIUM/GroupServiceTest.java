package Day16_11_20.homework.MEDIUM;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GroupServiceTest {
    GroupService groupService = new GroupService();

    @Test
    void moveGroup() {
        ArrayList<School> allSchools = new ArrayList<>();
        School mokyklaIsKuriosPerkeltiGrupe = new School();
        mokyklaIsKuriosPerkeltiGrupe.setName("Sena mokykla");
        Group liekantiGrupe = new Group();
        liekantiGrupe.setName("Liekanti grupe");
        Group perkeliamaGrupe = new Group();
        perkeliamaGrupe.setName("Perkeliama grupe");
        ArrayList<Group> mokyklosIsKuriosPerkelsimGrupe = new ArrayList<>();
        mokyklosIsKuriosPerkelsimGrupe.add(liekantiGrupe);
        mokyklosIsKuriosPerkelsimGrupe.add(perkeliamaGrupe);
        mokyklaIsKuriosPerkeltiGrupe.setGroups(mokyklosIsKuriosPerkelsimGrupe);

        Group group1NaujojeMokykloje = new Group();
        group1NaujojeMokykloje.setName("group1Naujoje");
        Group group2NaujojeMoykloje = new Group();
        group2NaujojeMoykloje.setName("group2Naujoje");
        ArrayList<Group> groupsNaujojeMokykloje = new ArrayList<>();
        groupsNaujojeMokykloje.add(group1NaujojeMokykloje);
        groupsNaujojeMokykloje.add(group2NaujojeMoykloje);
        School naujaMokykla = new School();
        naujaMokykla.setName("Nauja mokykla");

        allSchools.add(mokyklaIsKuriosPerkeltiGrupe);
        allSchools.add(naujaMokykla);

        naujaMokykla.setGroups(groupsNaujojeMokykloje);

        groupService.moveGroup(mokyklaIsKuriosPerkeltiGrupe, naujaMokykla, perkeliamaGrupe);
        assertEquals(1, mokyklaIsKuriosPerkeltiGrupe.getGroups().size());
        assertEquals(3, naujaMokykla.getGroups().size());
    }

    @Test
    void getGroupWithMostStudents() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        ArrayList<Student> studentsAtGroup1 = new ArrayList<>();
        studentsAtGroup1.add(student1);
        studentsAtGroup1.add(student5);
        ArrayList<Student> studentsAtGroup2 = new ArrayList<>();
        studentsAtGroup2.add(student2);
        studentsAtGroup2.add(student3);
        studentsAtGroup2.add(student4);

        Group group1 = new Group();
        group1.setStudents(studentsAtGroup1);
        Group group2 = new Group();
        group2.setName("2 grupe");
        group2.setStudents(studentsAtGroup2);
        ArrayList<Group> allSchool1Groups = new ArrayList<>();
        allSchool1Groups.add(group1);
        allSchool1Groups.add(group2);
        School school1 = new School();
        school1.setGroups(allSchool1Groups);

        ArrayList<School> allSchools = new ArrayList<>();
        allSchools.add(school1);
        ArrayList<Group> mostStudentsGroup = groupService.getGroupWithMostStudents(allSchools);
        assertEquals(3, mostStudentsGroup.get(0).getStudents().size());
        assertEquals("2 grupe", mostStudentsGroup.get(0).getName());


    }
}