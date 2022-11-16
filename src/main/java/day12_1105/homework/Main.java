package day12_1105.homework;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        PatientDataBase patientDataBase = new PatientDataBase();
        ArrayList<Patient> pacientuDuomenys = patientDataBase.getPatientDataBase();

        PatientService patientService = new PatientService();
        ArrayList<Patient> oldestPatient = patientService.getOldestPatient(pacientuDuomenys);
        ArrayList<Patient> patientsStartWithSpecificLetters = patientService.findPatientsWithNamesStartingWith("Ra", pacientuDuomenys);
        Patient tallestPatient = patientService.getTallestPatient(pacientuDuomenys, false);
        ArrayList<Patient> patientsHeaverThanSpecificWeight = patientService.findPatientsHeavierThanGivenWeight(pacientuDuomenys, 59.0);
        ArrayList<Patient> patientsWithSpecificBloodType = patientService.getPatientsWithSpecificBloodType(pacientuDuomenys, "B-");
        ArrayList<Patient> patientsTallerThanSpecificHeight = patientService.findPatientsTallerThanGivenHeight(pacientuDuomenys, 169.0);

        //RECIEPIENT WHO NEED A BLOOD
        Patient patient = new Patient();
        patient.bloodType = "O-";
        Patient patient1 = new Patient();
        patient1.bloodType = "O+";
        Patient patient2 = new Patient();
        patient2.bloodType = "A-";
        Patient patient3 = new Patient();
        patient3.bloodType = "A+";
        Patient patient4 = new Patient();
        patient4.bloodType = "B-";
        Patient patient5 = new Patient();
        patient5.bloodType = "B+";
        Patient patient6 = new Patient();
        patient6.bloodType = "AB-";
        Patient patient7 = new Patient();
        patient7.bloodType = "AB+";
        ArrayList<Patient> reciepients = new ArrayList<>();
        reciepients.add(patient);
        reciepients.add(patient1);
        reciepients.add(patient2);
        reciepients.add(patient3);
        reciepients.add(patient4);
        reciepients.add(patient5);
        reciepients.add(patient6);
        reciepients.add(patient7);

        for (Patient singlereciepient : reciepients) {
            System.out.println("Patient who can donate a blood for" + singlereciepient.bloodType + "  " +
                    "bloodype are : "  );
         patientService.findPatientsWhoCanDonateBlood(singlereciepient,pacientuDuomenys);

        }
//
//        System.out.println("O-");
//        patientService.findPatientsWhoCanDonateBlood(patient, pacientuDuomenys);
//        System.out.println("O+");
//        patientService.findPatientsWhoCanDonateBlood(patient1, pacientuDuomenys);
//        System.out.println("A-");
//        patientService.findPatientsWhoCanDonateBlood(patient2, pacientuDuomenys);
//        System.out.println("A+");
//        patientService.findPatientsWhoCanDonateBlood(patient3, pacientuDuomenys);
//        System.out.println("B-");
//        patientService.findPatientsWhoCanDonateBlood(patient4, pacientuDuomenys);
//        System.out.println("B+");
//        patientService.findPatientsWhoCanDonateBlood(patient5, pacientuDuomenys);
//        System.out.println("AB-");
//        patientService.findPatientsWhoCanDonateBlood(patient6, pacientuDuomenys);
//        System.out.println("AB+");
//        patientService.findPatientsWhoCanDonateBlood(patient7, pacientuDuomenys);


    }
}
