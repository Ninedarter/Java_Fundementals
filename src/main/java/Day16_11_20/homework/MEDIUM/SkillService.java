package Day16_11_20.homework.MEDIUM;

import java.util.ArrayList;

public class SkillService {

    public Student getStudentWithMostSkillsFromGivenSchool(School school) {
        Student mostCleverStudent = school.getGroups().get(0).getStudents().get(0);
        for (Group group : school.getGroups()) {
            for (Student student : group.getStudents()) {
                if (student != null && student.getSkills().size() > mostCleverStudent.getSkills().size()) {
                    mostCleverStudent = student;
                }
            }
        }
        return mostCleverStudent;
    }

    //tvarkyti metodaa
    public ArrayList<Skill> getAllSkills(ArrayList<Town> towns) {
        ArrayList<Skill> allSkills = new ArrayList<>();
        for (Town town : towns) {
            for (School school : town.getSchools()) {
                for (Group group : school.getGroups()) {
                    for (Student student : group.getStudents()) {
                        for (Skill skill : student.getSkills()) {
                            if (!allSkills.contains(skill)) {
                                allSkills.add(skill);
                            }

                        }
                    }
                }
            }
        }
        return allSkills;
    }
}
