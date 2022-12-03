package Day16_11_20.homework.MEDIUM;

import java.util.ArrayList;

public class StudentService {

    public Student getBestStudentFromGivenGroup(Group group) {
        Student bestStudent = group.getStudents().get(0);
        for (Student student : group.getStudents()) {
            if (student != null && student.getGradeAverage() > bestStudent.getGradeAverage()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    public Student getTallestStudentFromGivenSchool(School school) {
        Student tallestStudent = school.getGroups().get(0).getStudents().get(0); //ar SITAS APPROACHAS
        for (Group group : school.getGroups()) {
            for (Student student : group.getStudents()) {
                if (student != null && student.getHeightInCm() > tallestStudent.getHeightInCm()) {
                    tallestStudent = student;
                }
            }
        }

        return tallestStudent;
    }

    public Student getHeaviestStudentFromGivenTown(Town town) {
        Student heaviestStudent = town.getSchools().get(0).getGroups().get(0).getStudents().get(0);
        for (School school : town.getSchools()) {
            for (Group group : school.getGroups()) {
                for (Student student : group.getStudents()) {
                    if (student != null && student.getWeightInKg() > heaviestStudent.getWeightInKg()) {
                        heaviestStudent = student;
                    }
                }
            }
        }
        return heaviestStudent;
    }

    public ArrayList<Student> getStudentsOlderThanGivenAge(ArrayList<School> schools, int ageToCompare) {
        ArrayList<Student> studentsOlderThanGivenAge = new ArrayList<>();
        for (School school : schools) {
            for (Group group : school.getGroups()) {
                for (Student student : group.getStudents()) {
                    if (student != null && student.getAge() > ageToCompare) {
                        studentsOlderThanGivenAge.add(student);
                    }
                }
            }
        }
        return studentsOlderThanGivenAge;
    }

    public void moveStudentFromOneGroupToAnother(Student perkeliamasStudentas, Group grupeIsKuriosPerkeliamas, Group grupeIKuriaPerkelti) {
        ArrayList<Student> studentaiIsDabartinesGrupes = grupeIsKuriosPerkeliamas.getStudents();
        ArrayList<Student> grupesStudentaiIkuriaPersikels = grupeIKuriaPerkelti.getStudents();

        grupesStudentaiIkuriaPersikels.add(perkeliamasStudentas);
        grupeIKuriaPerkelti.setStudents(grupesStudentaiIkuriaPersikels);

        studentaiIsDabartinesGrupes.remove(perkeliamasStudentas);
        grupeIsKuriosPerkeliamas.setStudents(studentaiIsDabartinesGrupes);

    }
}
