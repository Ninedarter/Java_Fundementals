package Day16_11_20.homework.MEDIUM;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SkillServiceTest {

    @Test
    void getStudentWithMostSkillsFromGivenSchool() {
        SkillService skillService = new SkillService();
        School school = new School();
        Skill skill1 = new Skill();
        skill1.setName("Write");
        Skill skill2 = new Skill();
        skill2.setName("Read");
        Skill skill3 = new Skill();
        skill3.setName("Count");
        Skill skill4 = new Skill();
        Skill skill5 = new Skill();
        ArrayList<Skill> skillForBadStudent = new ArrayList<>();
        skillForBadStudent.add(skill1);
        Student badStudent = new Student();
        badStudent.setSkills(skillForBadStudent);
        ArrayList<Student> badStudentInGroup = new ArrayList<>();
        badStudentInGroup.add(badStudent);

        Group badStudentGroup = new Group();
        badStudentGroup.setStudents(badStudentInGroup);

        Group goodStudentGroup = new Group();
        Student goodStudent = new Student();
        goodStudent.setName("Marius");
        ArrayList<Skill> goodStudentSkills = new ArrayList<>();
        goodStudentSkills.add(skill1);
        goodStudentSkills.add(skill2);
        goodStudentSkills.add(skill3);
        goodStudent.setSkills(goodStudentSkills);
        ArrayList<Student> goodStudentInGroup = new ArrayList<>();

        Student alsoGoodStudent = new Student();
        ArrayList<Skill> notSoGood = new ArrayList<>();
        notSoGood.add(skill4);
        notSoGood.add(skill5);
        alsoGoodStudent.setSkills(notSoGood);
        goodStudentInGroup.add(goodStudent);
        goodStudentInGroup.add(alsoGoodStudent);
        goodStudentGroup.setStudents(goodStudentInGroup);
        ArrayList<Group> allSchoolGroups = new ArrayList<>();
        allSchoolGroups.add(badStudentGroup);
        allSchoolGroups.add(goodStudentGroup);
        school.setGroups(allSchoolGroups);

        Student mostCleverStudents = skillService.getStudentWithMostSkillsFromGivenSchool(school);
        assertEquals(3, mostCleverStudents.getSkills().size());
        assertEquals("Marius", mostCleverStudents.getName());

    }

    @Test
    void getAllSkills() {

        SkillService skillService = new SkillService();
        School school = new School();
        Skill skill1 = new Skill();
        skill1.setName("Write");
        Skill skill2 = new Skill();
        skill2.setName("Read");
        Skill skill3 = new Skill();
        skill3.setName("Count");
        Skill skill4 = new Skill();
        skill4.setName("Sing");
        Skill skill5 = new Skill();
        skill5.setName("Paint");
        ArrayList<Skill> skillForBadStudent = new ArrayList<>();
        skillForBadStudent.add(skill1);
        Student badStudent = new Student();
        badStudent.setSkills(skillForBadStudent);
        ArrayList<Student> badStudentInGroup = new ArrayList<>();
        badStudentInGroup.add(badStudent);

        Group badStudentGroup = new Group();
        badStudentGroup.setStudents(badStudentInGroup);

        Group goodStudentGroup = new Group();
        Student goodStudent = new Student();
        goodStudent.setName("Marius");
        ArrayList<Skill> goodStudentSkills = new ArrayList<>();
        goodStudentSkills.add(skill1);
        goodStudentSkills.add(skill2);
        goodStudentSkills.add(skill3);
        goodStudent.setSkills(goodStudentSkills);
        ArrayList<Student> goodStudentInGroup = new ArrayList<>();

        Student alsoGoodStudent = new Student();
        ArrayList<Skill> notSoGood = new ArrayList<>();
        notSoGood.add(skill4);
        notSoGood.add(skill5);
        alsoGoodStudent.setSkills(notSoGood);
        goodStudentInGroup.add(goodStudent);
        goodStudentInGroup.add(alsoGoodStudent);
        goodStudentGroup.setStudents(goodStudentInGroup);
        ArrayList<Group> allSchoolGroups = new ArrayList<>();
        allSchoolGroups.add(badStudentGroup);
        allSchoolGroups.add(goodStudentGroup);
        school.setGroups(allSchoolGroups);
        Town town = new Town();
        ArrayList<School> schools = new ArrayList<>();
        schools.add(school);
        town.setSchools(schools);
        ArrayList<Town> towns = new ArrayList<>();
        towns.add(town);
        ArrayList<Skill> allSkills = skillService.getAllSkills(towns);
        assertEquals(5, allSkills.size());
        assertEquals("Write", allSkills.get(0).getName());
        assertEquals("Read", allSkills.get(1).getName());
        assertEquals("Paint", allSkills.get(4).getName());
    }
}