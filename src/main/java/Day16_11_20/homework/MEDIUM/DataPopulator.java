package Day16_11_20.homework.MEDIUM;

import com.github.javafaker.Faker;

import java.util.ArrayList;

public class DataPopulator {

    public ArrayList<Town> populateData(int townsToCreate) {
        Faker faker = new Faker();
        Town town = new Town();
        ArrayList<Town> createdTowns = new ArrayList<>();

        for (int i = 0; i < townsToCreate; i++) {
            String name = faker.address().cityName();
            int population = faker.number().numberBetween(10000, 30000);
            String country = faker.address().country();
            int yearEstablished = faker.number().numberBetween(1, 250);
            int schoolsToCreate = faker.number().numberBetween(2, 8);
            ArrayList<School> schools = town.createSchools(schoolsToCreate);
            Town townCreated = new Town(name, population, country, yearEstablished, schools);
            createdTowns.add(townCreated);
        }
        return createdTowns;
    }
//
//        Skill skill1 = new Skill("Rasyti","Raso didziosiomis ir mazosiomis raidemis",Difficulty.Easy);
//        Skill skill2 = new Skill("Skaityti","Skaito sakinius be trikdziu",Difficulty.Easy);
//        Skill skill3 = new Skill("Skaiciuoti","Moka sudeti, atimti, daugybos lentele",Difficulty.Medium);
//        Skill skill4 = new Skill("Skaiciuoti","Moka sudeti, atimti, daugybos lentele",Difficulty.Medium);
//        Skill skill5 = new Skill("Anglu kalba","Moka aiskiai kalbeti ir suprasti skaitydamas",Difficulty.AboveMedium);
//        Skill skill6 = new Skill("Piesimas","Moka nupiesti autoportreta bei eskizus",Difficulty.Hard);
//        Skill skill7 = new Skill("Trigonometrija", "Moka naudoti trigonometrines formules",Difficulty.Ultimate);
//
//        ArrayList<Skill> skillKomplektas1 = new ArrayList<>();
//        skillKomplektas1.add(skill1);
//        skillKomplektas1.add(skill3);
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
//
//
//        Student linas = new Student("Linas",17,9.4,174,65,skillKomplektas4);
//        Student andrius= new Student("Andrius",15,9.0,168,96,skillKomplektas3);
//        Student tomas= new Student("Tomas",13,10.0,150,59,skillKomplektas2);
//        Student urte= new Student("Urte",16,9.9,158,57,skillKomplektas1);
//        Student laimis= new Student("Laimis",18,8.8,196,88,skillKomplektas3);
//        Student raimis= new Student("Raimis",17,8.0,169,70,skillKomplektas2);
//        Student agne= new Student("Agne",19,10.0,168,60,skillKomplektas3);
//        Student marija= new Student("Marija",14,7.5,150,51,skillKomplektas1);
//        Student eimantas= new Student("Eimantas",16,8.7,159,67,skillKomplektas4);
//
//        ArrayList<Student> group1 = new ArrayList<>();
//        group1.add(linas);
//        group1.add(andrius);
//        group1.add(tomas);
//
//        ArrayList<Student> group2 = new ArrayList<>();
//        group2.add(urte);
//        group2.add(laimis);
//        group2.add(raimis);
//
//        ArrayList<Student> group3 = new ArrayList<>();
//        group3.add(agne);
//        group3.add(marija);
//        group3.add(eimantas);
//
//        Town Majamis = new Town();
//        Town RadVegasas = new Town();
//        Town Warsuva = new Town();
//        //_____________MAJAMIS_______________
//        School mokyklaMajami1 = new School();
//        School mokyklaMajami2 = new School();
//        ArrayList<School> mokyklosMajami = new ArrayList<>();
//        mokyklosMajami.add(mokyklaMajami1);
//        mokyklosMajami.add(mokyklaMajami2);
//
//
//
//
//
//
//
//
//
//
//        //_____________RADVEGASAS______________
//        School mokyklaRadvegase1 = new School();
//        School mokyklaRadvegase2 = new School();
//        ArrayList<School> mokyklosRadvegase = new ArrayList<>();
//        mokyklosRadvegase.add(mokyklaRadvegase1);
//        mokyklosRadvegase.add(mokyklaRadvegase2);
//
//        //_____________WARSAVA______________
//        School mokyklaWarsuvoj1 = new School();
//        School mokyklaWarsuvoj2 = new School();
//        ArrayList<School> mokyklosWarsavoj = new ArrayList<>();
//        mokyklosWarsavoj.add(mokyklaWarsuvoj1);
//        mokyklosWarsavoj.add(mokyklaWarsuvoj2);
//
//
//
//
//
//
//
//
//        ArrayList<Town> miestai = new ArrayList<>();
//        return miestai;
//    }
}
