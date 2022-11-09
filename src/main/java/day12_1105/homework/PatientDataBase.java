package day12_1105.homework;


import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class PatientDataBase {
    /**
     * Reads txt file and returns ArrayList of patients by format : Patient(name, age, bloodType, heightInCm, weightInKg)
     */
    public static final String PATH_TO_FILE = "src/main/resources/DataBasePatients";

    public ArrayList<Patient> getPatientDataBase() throws IOException {
        ArrayList<Patient> patientsList = new ArrayList<>();
        FileReader fileReader = new FileReader(PATH_TO_FILE);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String lineReaded = bufferedReader.readLine();
        ArrayList<String> rawData = new ArrayList<>();
        while (lineReaded != null) {
            rawData.add(lineReaded.toUpperCase());
            lineReaded = bufferedReader.readLine();
        }
        for (String patient : rawData) {
            String[] dataSplitted = patient.split(",");
            String name = dataSplitted[0];
            int age = Integer.parseInt(dataSplitted[1]);
            String bloodType = dataSplitted[2];
            int heightInCm = Integer.parseInt(dataSplitted[3]);
            double weightInKg = Double.parseDouble(dataSplitted[4]);
            Patient patientToAdd = new Patient(name, age, bloodType, heightInCm, weightInKg);
            patientsList.add(patientToAdd);
        }
        return patientsList;
    }


}
