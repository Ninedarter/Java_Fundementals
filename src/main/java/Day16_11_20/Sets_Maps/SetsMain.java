package Day16_11_20.Sets_Maps;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

public class SetsMain {

    public static void main(String[] args) {

        System.out.println("Array____");
        int[] numeriai = new int[3];
        numeriai[0] = 5;
        numeriai[1] = 9;
        numeriai[2] = -6;
        System.out.println(Arrays.toString(numeriai));
        System.out.println();


        System.out.println("ArrayList / List");
        ArrayList<String> vardai = new ArrayList<>();
        vardai.add("Ieva");
        vardai.add("Martin");
        for (String vardas : vardai) {
            System.out.println(vardas);
        }
        System.out.println();

//setu sukurimas(rinkinio),kur elementai neturi tvarkos ir negali kartotis.
        HashSet<String> metulaikai = new HashSet<>();

        metulaikai.add("Vasara");
        metulaikai.add("Ruduo");
        metulaikai.add("Ziema");
        metulaikai.add("Pavasaris");
        for (String metulaikas : metulaikai) {
            System.out.println(metulaikas);
        }
        HashSet<String> zodziai = new HashSet<>();
        zodziai.add("Labas");
        zodziai.add("Ate");

        HashSet<String> zodziai1 = new HashSet<>();
        zodziai1.add("Labas");
        zodziai1.add("Ate");
        System.out.println(zodziai.equals(zodziai1));

        // kaip zodynas arba telefonu knyga.
        HashMap<String, Phone> varduIrPhonesMap = new HashMap<>();
        varduIrPhonesMap.put("Darius", new Phone("Iphone X", 1500));
        varduIrPhonesMap.put("Igoris", new Phone("Samsung", 1700));
        varduIrPhonesMap.put("Katazina", new Phone("Laidinis", 230));
        System.out.println(varduIrPhonesMap);
        //galimos trys iteracijjos
        //1. Iteruoti per visus key(raktus)
        for (String raktas : varduIrPhonesMap.keySet()) {
            System.out.println(raktas);
        }
        // iteruoti galima ir per reiksmes(values)
        for (Phone value : varduIrPhonesMap.values()) {
            System.out.println(value);
        }
        //3.entry set - per visa irasa
        System.out.println();
        System.out.println();
        for (Map.Entry<String, Phone> visasIrasas : varduIrPhonesMap.entrySet()) {
            System.out.println(visasIrasas);
        }
    }
}
@Data
@AllArgsConstructor
class Phone {
    private String name;
    private int price;
}