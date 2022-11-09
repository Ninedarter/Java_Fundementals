//package day12_1105.homework;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//
//        PatientDataBase patientDataBase = new PatientDataBase();
//        ArrayList<Patient> pacientuDuomenys = patientDataBase.getPatientDataBase();
//
//        PatientService patientService = new PatientService();// ar PatientDataBase ir PatientService kurti tada kai naudojam ar pagal praktika  iskart 9 ir 10 eilutej
//      Patient oldestPatient =   patientService.getOldestPatient(pacientuDuomenys);
//        System.out.println(oldestPatient);
//
//
//        ArrayList<Patient> patientsStartWithSpecificLetters = patientService.findPatientsWithNamesStartingWith("Ra");
//        System.out.println(patientsStartWithSpecificLetters);
//
//        Patient talestPatient = patientService.getTallestPatient(pacientuDuomenys);
//        System.out.println(talestPatient);
//        ArrayList<Patient> patientsHeaverThanSpecificWeight = patientService.findPatientsHeavierThanGivenWeight(pacientuDuomenys, 59.0);
//        System.out.println(patientsHeaverThanSpecificWeight);
//        ArrayList<Patient>patientsWithSpecificBloodType = patientService.getPatientsWithSpecificBloodType(pacientuDuomenys,"B-");
//        System.out.println(patientsWithSpecificBloodType);
//        ArrayList<Patient>patientsTallerThanSpecificHeight = patientService.findPatientsTallerThanGivenHeight(pacientuDuomenys,169.0);
//        System.out.println(patientsTallerThanSpecificHeight);
//
//
//
//
//
//    }
//}
