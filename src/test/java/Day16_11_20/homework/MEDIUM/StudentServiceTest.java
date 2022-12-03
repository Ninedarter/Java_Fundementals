package Day16_11_20.homework.MEDIUM;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    StudentService studentService = new StudentService();

    @Test
    void getBestStudentFromGivenGroup() {
        Group givenGroup = new Group();
        Student student1 = new Student();

        student1.setGradeAverage(5.5);
        Student student2 = new Student();
        student2.setName("Marius");
        student2.setGradeAverage(9.3);
        Student student3 = new Student();
        student3.setGradeAverage(8);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        givenGroup.setStudents(students);
        //  StudentServiceTest studentServiceTest = new StudentServiceTest();

        Student bestStudent = studentService.getBestStudentFromGivenGroup(givenGroup);
        assertEquals("Marius", bestStudent.getName());
        assertEquals(9.3, bestStudent.getGradeAverage());


    }

    @Test
    void getTallestStudentFromGivenSchool() {
        School school = new School();
        Group group1 = new Group();
        Group group2 = new Group();
        Student student1 = new Student();
        student1.setHeightInCm(158);
        Student student2 = new Student();
        student2.setHeightInCm(178);
        Student student3 = new Student();
        student3.setName("Jonas");
        student3.setHeightInCm(195);
        Student student4 = new Student();
        student4.setHeightInCm(169);
        student4.setName("Arnas");
        ArrayList<Student> group1Students = new ArrayList<>();
        group1Students.add(student1);
        group1Students.add(student2);
        group1.setStudents(group1Students);
        ArrayList<Student> group2Students = new ArrayList<>();
        group2Students.add(student3);
        group2Students.add(student4);
        group2.setStudents(group2Students);

        ArrayList<Group> groupsAtSchool = new ArrayList<>();
        groupsAtSchool.add(group1);
        groupsAtSchool.add(group2);
        school.setGroups(groupsAtSchool);


        Student actualTallestStudent = studentService.getTallestStudentFromGivenSchool(school);
        assertEquals("Jonas", actualTallestStudent.getName());
        assertEquals(195, actualTallestStudent.getHeightInCm());
    }

    @Test
    void getHeaviestStudentFromGivenTown() {
        School school = new School();
        Group group1 = new Group();
        Group group2 = new Group();
        Student student1 = new Student();
        student1.setWeightInKg(60);
        Student student2 = new Student();
        student2.setWeightInKg(58);
        Student student3 = new Student();
        student3.setName("Jonas");
        student3.setWeightInKg(110);
        Student student4 = new Student();
        student4.setWeightInKg(99);
        student4.setName("Arnas");
        ArrayList<Student> group1Students = new ArrayList<>();
        group1Students.add(student1);
        group1Students.add(student2);
        group1.setStudents(group1Students);
        ArrayList<Student> group2Students = new ArrayList<>();
        group2Students.add(student3);
        group2Students.add(student4);
        group2.setStudents(group2Students);

        ArrayList<Group> groupsAtSchool = new ArrayList<>();
        groupsAtSchool.add(group1);
        groupsAtSchool.add(group2);
        school.setGroups(groupsAtSchool);
        ArrayList<School> schools = new ArrayList<>();
        Town town = new Town();
        town.setSchools(schools);
        Student actualHeaviestStudent = new Student();
        actualHeaviestStudent = studentService.getHeaviestStudentFromGivenTown(town);
        assertEquals("Jonas", actualHeaviestStudent.getName());
        assertEquals(110, actualHeaviestStudent.getWeightInKg());

    }

    @Test
    void getStudentsOlderThanGivenAge() {
        int givenAge = 15;
        Student student1 = new Student();
        student1.setAge(16);
        student1.setName("Marija");
        Student student2 = new Student();
        student2.setAge(15);
        student2.setName("Arunas");
        Student student3 = new Student();
        student3.setAge(18);
        student3.setName("Laimonas");
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Group group = new Group();
        group.setStudents(students);
        ArrayList<Group> groups = new ArrayList<>();
        groups.add(group);
        School school = new School();
        school.setGroups(groups);
        ArrayList<School> schools = new ArrayList<>();
        schools.add(school);

        ArrayList<Student> actualStudentsOlderThanGivenAge = studentService.getStudentsOlderThanGivenAge(schools, givenAge);
        assertEquals(2, actualStudentsOlderThanGivenAge.size());
        assertEquals("Marija", actualStudentsOlderThanGivenAge.get(0).getName());
        assertEquals("Laimonas", actualStudentsOlderThanGivenAge.get(1).getName());
    }

    @Test
    void moveStudentFromOneGroupToAnother() {
        Student perkeliamasStudentas = new Student();
        perkeliamasStudentas.setName("Jonas");
        ArrayList<Student> studentaiGrupeje1 = new ArrayList<>();
        studentaiGrupeje1.add(perkeliamasStudentas);
        Group grupeSenojeMokykloje = new Group();
        grupeSenojeMokykloje.setStudents(studentaiGrupeje1);
        School school = new School();
        ArrayList<Group> grupesMokykloje = new ArrayList<>();
        grupesMokykloje.add(grupeSenojeMokykloje);

        Group grupe2 = new Group();
        Student studentas2Grupeje1 = new Student();
        Student studentas2Grupeje2 = new Student();
        ArrayList<Student> studentaiGrupeje2 = new ArrayList<>();
        studentaiGrupeje2.add(studentas2Grupeje1);
        studentaiGrupeje2.add(studentas2Grupeje2);
        grupe2.setStudents(studentaiGrupeje2);
        grupesMokykloje.add(grupe2);

        school.setGroups(grupesMokykloje);

        studentService.moveStudentFromOneGroupToAnother(perkeliamasStudentas, grupeSenojeMokykloje, grupe2);
        assertEquals(3, grupe2.getStudents().size());
        assertEquals(0, grupeSenojeMokykloje.getStudents().size());

    }
}