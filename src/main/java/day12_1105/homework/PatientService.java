package day12_1105.homework;

import java.io.IOException;
import java.util.ArrayList;

public class PatientService {

    /**
     * Compares all patients from the ArrayList, to get oldest patient. If there are several, return all of them
     *
     * @param patients
     * @return oldest patient as dataType <ArrayList> Patient
     */

    public ArrayList<Patient> getOldestPatient(ArrayList<Patient> patients) {
        ArrayList<Patient> oldestPatient = new ArrayList();
        Patient patient = new Patient();
        patient.age = 0;
        int currentlyOldestPatientAge = 0;
        for (Patient singlePatient : patients) {
            if (singlePatient.age >= currentlyOldestPatientAge) {
                currentlyOldestPatientAge = singlePatient.age;
                oldestPatient.add(singlePatient);
            }
        }
        return oldestPatient;
    }


    /**
     * @param specificStartOfName = begining of name, which will be use for sorting you patients
     * @return ArrayList<Patient> of patients which names starts with specific letters
     * @throws IOException
     */
    public ArrayList<Patient> findPatientsWithNamesStartingWith(String specificStartOfName, ArrayList<Patient> patients) throws IOException {
        //patients  = patientDataBase.getPatientDataBase();buvau palikes sita eilute ir vis nesuprantama klaida...
        ArrayList<Patient> patientsStartingWithSpecificStartOfName = new ArrayList<>();
        String partOfNameUpperCase = specificStartOfName.toUpperCase();
        for (Patient singlePatient : patients) {
            if (singlePatient.name.startsWith(partOfNameUpperCase)) {
                patientsStartingWithSpecificStartOfName.add(singlePatient);
            }
        }
        return patientsStartingWithSpecificStartOfName;
    }

    /**
     * Compares all patients from the ArrayList, to get tallest patient. If there are several, return all of them
     *
     * @param patients
     * @return tallest patient as dataType <ArrayList> Patient
     */
    public Patient getTallestPatient(ArrayList<Patient> patients, boolean informationNeedToPrint) {
        Patient tallestPatient = new Patient();
        tallestPatient.heightInCm = 0;
        int currentlyMaxHeight = 0;
        for (Patient singlePatient : patients) {
            if (singlePatient.heightInCm >= currentlyMaxHeight) {
                currentlyMaxHeight = singlePatient.heightInCm;
                tallestPatient = singlePatient;
                if (informationNeedToPrint) {
                    System.out.println("Tallest patient : " + tallestPatient);
                }
            }
        }
        return tallestPatient;
    }


    /**
     * Compares all patients from the ArrayList, to get patients heavier. If there are several, return all of them
     *
     * @param patients,       ArrayList of patients we want to filter
     * @param givenWeightInKg - specific weight by which patients will be added to ArrayList if they are heavier
     * @returnpatients patients as ArrayList<Patient> which are heavier than given weight
     */
    public ArrayList<Patient> findPatientsHeavierThanGivenWeight(ArrayList<Patient> patients, Double givenWeightInKg) {
        ArrayList<Patient> patientsHeavierThanGivenWeight = new ArrayList<>();
        for (Patient singlePatient : patients) {
            if (singlePatient.weightInKg > givenWeightInKg) {
                patientsHeavierThanGivenWeight.add(singlePatient);
            }
        }
        return patientsHeavierThanGivenWeight;
    }

    /**
     * Compares all patients from the ArrayList to get patients with specific blood type
     *
     * @param patients,ArrayList of patients we want to filter
     * @param givenBloodType,    specific blood type by which ArrayList will be created
     * @return patients as ArrayList<Patient> which have specific blood type
     */
    public ArrayList<Patient> getPatientsWithSpecificBloodType(ArrayList<Patient> patients, String givenBloodType) {
        givenBloodType = givenBloodType.toUpperCase().trim();
        ArrayList<Patient> patientsWithSpecificBloodType = new ArrayList<>();
        for (Patient singlePatient : patients) {
            if (singlePatient.bloodType.startsWith(givenBloodType)) { //panaudotas STARTS WITH metodas, kadangi tai universalesnis nei equals
                patientsWithSpecificBloodType.add(singlePatient);
            }
        }
        return patientsWithSpecificBloodType;
    }

    public ArrayList<Patient> findPatientsTallerThanGivenHeight(ArrayList<Patient> patients, Double givenHeightInCm) {
        ArrayList<Patient> patientsTallerThanGivenHeight = new ArrayList<>();
        for (Patient singlePatient : patients) {
            if (singlePatient.heightInCm > givenHeightInCm) {
                patientsTallerThanGivenHeight.add(singlePatient);
            }
        }

        return patientsTallerThanGivenHeight;
    }
//
//
//
//    B+ LINAS RAIMIS, ZITA , ANDRIUS, ZIGMAS, ROLANDAS
//0+ GENKA KAMILE, RAIMIS ZIGMAS, ZITA, ROLANDAS

    public ArrayList<String> findPatientsWhoCanDonateBlood(Patient patientWhoNeedsABlood, ArrayList<Patient> patients) {
        ArrayList<String> patientsWhoCanDonateBlood = new ArrayList<>();
        for (Patient singleDonor : patients) {
            char[] donorBloodType = singleDonor.bloodType.toCharArray();
            String donorAntigen = Character.toString(donorBloodType[0]);
            String donorRhesus = Character.toString(donorBloodType[1]);

            //pvz jei grupe bus AB+ TAI RESUS BUS NE +, O B, todel naudojamas IF kuris eliminuoja galimas klaidas

            if (patientWhoNeedsABlood.bloodType.equals("AB+") || singleDonor.bloodType.equals("O-") || patientWhoNeedsABlood.bloodType.equals(singleDonor.bloodType)) {
                patientsWhoCanDonateBlood.add(singleDonor.name);
            } else if (singleDonor.bloodType.equals("O+") && patientWhoNeedsABlood.bloodType.endsWith("+")) {
                patientsWhoCanDonateBlood.add(singleDonor.name);
            } else if (patientWhoNeedsABlood.bloodType.contains(donorAntigen) && singleDonor.bloodType.endsWith("-") && !singleDonor.bloodType.contains("B")) {
                patientsWhoCanDonateBlood.add(singleDonor.name);

            }


        }
        System.out.println(patientsWhoCanDonateBlood);
        return patientsWhoCanDonateBlood;
    }

}
