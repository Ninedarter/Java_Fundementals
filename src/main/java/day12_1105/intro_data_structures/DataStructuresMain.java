package day12_1105.intro_data_structures;

import java.util.ArrayList;

/**
 * Data structures
 * ArrayList
 */
public class DataStructuresMain {
    public static void main(String[] args) {

        //ArrayListas arba tiesiog LISTAS. Lietuviskai - sarasas.

        ArrayList<String> varduSarasas = new ArrayList<>();
        varduSarasas.add("Tomas");
        varduSarasas.add("Agne");
        varduSarasas.add("Stasys");


        for (String vardas : varduSarasas) {
            System.out.println(vardas);

        }
        varduSarasas.remove("Agne");
        System.out.println(varduSarasas);

        ///////////////////////////////////
        Person tim = new Person("Tim", 1200);
        Person rob = new Person("Rob", 1500);
        Person mat = new Person("Mat", 5200);

        ArrayList<Person> team = new ArrayList<>();
        team.add(tim);
        team.add(rob);
        team.add(mat);

        System.out.println(team);
        System.out.println(team.contains(rob));
        for (Person person : team) {
            if (person.salary >= 0){
                System.out.println(person.name + "earns " + person.salary );
            }
        }


    }
}


