package Day16_11_20.homework.MEDIUM;

import com.github.javafaker.Faker;
import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {


        Group group = new Group();

        DataPopulator dataPopulator = new DataPopulator();
        ArrayList<Town> towns = dataPopulator.populateData(2);
        System.out.println(towns);
        String json = new Gson().toJson(towns); //cia jusu arrayList kompaniju

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/towns.json"));
        writer.write(json);

        writer.close();

        DataService dataService = new DataService();

        System.out.println("Biggest town is" + dataService.getBiggestTown(towns));


    }
}
