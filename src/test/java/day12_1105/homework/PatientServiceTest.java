package day12_1105.homework;

import org.junit.Before;
import org.junit.BeforeClass;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static day12_1105.homework.PatientDataBase.PATH_TO_FILE;
import static org.junit.jupiter.api.Assertions.*;


class PatientServiceTest {
    PatientService patientService = new PatientService();

    @BeforeClass
    public static ArrayList<Patient> sampleDataForPatientsCreation() {
        ArrayList<Patient> patientArrayList = new ArrayList<>();
        Patient patient1 = new Patient("John", 25, "B+", 199, 85.0);
        Patient patient2 = new Patient("LINAS", 20, "A", 187, 67.4);
        Patient patient3 = new Patient("Raimis", 18, "B+", 145, 70.0);
        patientArrayList.add(patient1);
        patientArrayList.add(patient2);
        patientArrayList.add(patient3);
        return patientArrayList;
    }

    ArrayList<Patient> patientArrayList = sampleDataForPatientsCreation();

    @Test
    void shouldGetOldestPersonFromTheArrayList() {
        //given
        ArrayList<Patient> expectedOldestPatient = new ArrayList<>();
        expectedOldestPatient.add(patientArrayList.get(0));
        //when
        ArrayList<Patient> oldestPatient = patientService.getOldestPatient(patientArrayList);
        //then
        assertEquals(expectedOldestPatient, oldestPatient);

    }

    @Test
    void shouldFindPatientsWithNamesStartingWithSpecificLetters_When_LettersAreGiven() throws IOException {
        ArrayList<Patient> patientsWhichNamesStartsWithSpecificLetters = new ArrayList<>();
        ArrayList<Patient> expectedPatient = new ArrayList<>();
        expectedPatient.add(patientArrayList.get(1));
        patientsWhichNamesStartsWithSpecificLetters = patientService.findPatientsWithNamesStartingWith("LI", patientArrayList);

        assertEquals(expectedPatient, patientsWhichNamesStartsWithSpecificLetters);
//        for (Patient singlePatient : patientArrayList) {
//            if (singlePatient.name.startsWith(lettersGiven.toUpperCase())) {
//                patientsWhichNamesStartsWithSpecificLetters.add(singlePatient);
//            }
//        }


    }


    @Test
    void shouldGetTallestPatient() {
        Patient tallestPatient = patientService.getTallestPatient(patientArrayList);
        assertEquals(patientArrayList.get(0), tallestPatient);

    }

    @Test
    void shouldFindPatientsHeavierThanGivenWeight() {
        //GIVEN
        ArrayList<Patient> expectedPatients = new ArrayList<>();
        expectedPatients.add(patientArrayList.get(0));
        expectedPatients.add(patientArrayList.get(2));
        //WHEN
        ArrayList<Patient> actualPatients;
        actualPatients = patientService.findPatientsHeavierThanGivenWeight(patientArrayList, 68.0);
        //THEN
        assertEquals(expectedPatients, actualPatients);

    }

    @Test
    void shouldGetPatientsWithSpecificBloodType() {
        String givenBloodType = "B+";
        ArrayList<Patient> expectedPatientsToBe = new ArrayList<>();
        ArrayList<Patient> patientsWithSpecificBloodType = new ArrayList<>();
        for (Patient singlePatient : patientArrayList) {
            if (singlePatient.bloodType.equals(givenBloodType)) {
                expectedPatientsToBe.add(singlePatient);
            }
        }
        patientsWithSpecificBloodType = patientService.getPatientsWithSpecificBloodType(patientArrayList, "B+");
        assertEquals(expectedPatientsToBe, patientsWithSpecificBloodType);
    }

    @Test
    void shouldFindPatientsTallerThanGivenHeight() {
        int givenHeight = 160;
        ArrayList<Patient> expectedTallerPatientsThanGivenHeight = new ArrayList<>();
        ArrayList<Patient> actualTallerPatientsThanGivenHeight = new ArrayList<>();
        for (Patient singlePatient : patientArrayList) {
            if (singlePatient.heightInCm > givenHeight) {
                expectedTallerPatientsThanGivenHeight.add(singlePatient);
            }
        }
        actualTallerPatientsThanGivenHeight = patientService.findPatientsTallerThanGivenHeight(patientArrayList, 160.0);
        assertEquals(expectedTallerPatientsThanGivenHeight, actualTallerPatientsThanGivenHeight);
    }


}

