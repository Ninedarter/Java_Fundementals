package Day16_11_20.homework.MEDIUM;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Group {

    private String name;
    private ArrayList<Student> students;

    public ArrayList<Student> createAtLeast3Students(int studentsToCreate) {

        Faker faker = new Faker();
        Skill skill1 = new Skill("Rasyti", "Raso didziosiomis ir mazosiomis raidemis", Difficulty.Easy);
        Skill skill2 = new Skill("Skaityti", "Skaito sakinius be trikdziu", Difficulty.Easy);
        Skill skill3 = new Skill("Skaiciuoti", "Moka sudeti, atimti, daugybos lentele", Difficulty.Medium);
        Skill skill4 = new Skill("Skaiciuoti", "Moka sudeti, atimti, daugybos lentele", Difficulty.Medium);
        Skill skill5 = new Skill("Anglu kalba", "Moka aiskiai kalbeti ir suprasti skaitydamas", Difficulty.AboveMedium);
        Skill skill6 = new Skill("Piesimas", "Moka nupiesti autoportreta bei eskizus", Difficulty.Hard);
        Skill skill7 = new Skill("Trigonometrija", "Moka naudoti trigonometrines formules", Difficulty.Ultimate);

        ArrayList<Skill> skillKomplektas = new ArrayList<>();
        skillKomplektas.add(skill1);
        skillKomplektas.add(skill2);
        skillKomplektas.add(skill3);
        skillKomplektas.add(skill4);
        skillKomplektas.add(skill5);
        skillKomplektas.add(skill6);
        skillKomplektas.add(skill7);
//        ArrayList<Skill> skillKomplektas2 = new ArrayList<>();
//        skillKomplektas2.add(skill1);
//        skillKomplektas2.add(skill5);
//        skillKomplektas2.add(skill7);
//        ArrayList<Skill> skillKomplektas3 = new ArrayList<>();
//        skillKomplektas3.add(skill2);
//        skillKomplektas3.add(skill4);
//        skillKomplektas3.add(skill6);
//        ArrayList<Skill> skillKomplektas4 = new ArrayList<>();
//        skillKomplektas4.add(skill1);
//        skillKomplektas4.add(skill2);
//        skillKomplektas4.add(skill6);
        ArrayList<Student> createdStudents = new ArrayList<>();
        int maxAge = 20; //max age student 20
        int minAge = 7; // min age student 7
        int minAverage = 1;
        int maxAverage = 10;
        int maxHeight = 200;
        int minHeight = 140;
        int minWeight = 30;
        int maxWeight = 110;
        for (int i = 0; i < studentsToCreate; i++) {
            String name = faker.name().fullName();
            int age = ThreadLocalRandom.current().nextInt(minAge, maxAge + 1);
            int average = ThreadLocalRandom.current().nextInt(minAverage, maxAverage + 1);
            int height = (int) Math.round(Math.random() * (maxHeight - minHeight + 1) + minHeight);
            int weight = (int) Math.round((Math.random() * (maxWeight - minWeight + 1) + minWeight));
            Student student = new Student(name, age, average, height, weight, skillKomplektas);//reikia patvarkyt kad imtu random skills
            createdStudents.add(student);
        }
        return createdStudents;
    }
}
