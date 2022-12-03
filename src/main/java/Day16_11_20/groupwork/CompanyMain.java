package Day16_11_20.groupwork;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CompanyMain {
    public static void main(String[] args) throws IOException {
        Responsibility writeUnitTest = new Responsibility("Write UNIT tests", Complexity.EASY);
        Responsibility readDocumentation = new Responsibility("Read docs", Complexity.MEDIUM);
        Responsibility participateInMeetings = new Responsibility("Participate in meetings", Complexity.HARD);
        ArrayList<Responsibility> justasResp = new ArrayList<>();
        justasResp.add(writeUnitTest);
        justasResp.add(readDocumentation);

        Employee justas = new Employee("Justas", Seniority.INTERN, 3600, justasResp);

        ArrayList<Responsibility> eimantasResp = new ArrayList<>();
        eimantasResp.add(writeUnitTest);
        eimantasResp.add(readDocumentation);
        eimantasResp.add(participateInMeetings);

        Employee eimantas = new Employee("Eimantas", Seniority.MID, 5000, eimantasResp);
        ArrayList<Responsibility> direktoriausResp = new ArrayList<>();
        direktoriausResp.add(readDocumentation);
        direktoriausResp.add(participateInMeetings);
        String direktorius = new String();
        ArrayList<Employee> departmentEmployees = new ArrayList<>();
        departmentEmployees.add(justas);
        departmentEmployees.add(eimantas);
        Department backEnd = new Department("Back end skyrius", direktorius, departmentEmployees);
        ArrayList<Department> swedBankDepartements = new ArrayList<>();
        swedBankDepartements.add(backEnd);
        Company swedbankas = new Company("Swedbankas", 650000, "basanaviciaus 20g.", swedBankDepartements);


        Responsibility makeArchitecture = new Responsibility("Make architecture", Complexity.HARD);
        Responsibility checkForBugs = new Responsibility("Check for bugs", Complexity.EASY);
        Responsibility informDirectorAboutMadeProject = new Responsibility("Inform director about made project", Complexity.MEDIUM);
        ArrayList<Responsibility> ievaResp = new ArrayList<>();
        ievaResp.add(makeArchitecture);
        ievaResp.add(checkForBugs);
        Employee ieva = new Employee("Ieva", Seniority.SENIOR, 3500, ievaResp);


        ArrayList<Responsibility> martinResp = new ArrayList<>();

        martinResp.add(informDirectorAboutMadeProject);
        martinResp.add(checkForBugs);
        Employee martin = new Employee("Martin", Seniority.SENIOR, 7000, martinResp);
        ArrayList<Employee> frontEndEmployees = new ArrayList<>();
        frontEndEmployees.add(ieva);
        frontEndEmployees.add(martin);

        Department frontEnd = new Department("Front end department", direktorius, frontEndEmployees);
        ArrayList<Department> nortalDepartments = new ArrayList<>();
        nortalDepartments.add(frontEnd);
        Company nortal = new Company("Nortal", 999999, "Rinktines 5,", nortalDepartments);
        ArrayList<Company> kompanijuSarasas = new ArrayList<>();
        kompanijuSarasas.add(swedbankas);
        kompanijuSarasas.add(nortal);
        String json = new Gson().toJson(kompanijuSarasas); //cia jusu arrayList kompaniju

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/companies.json"));
        writer.write(json);

        writer.close();
        showRensponsibilities(kompanijuSarasas);
    }
    private static void showRensponsibilities(ArrayList<Company> kompanijuSarasas) {
        for (Company kompanija : kompanijuSarasas) {
            for (Department department : kompanija.getDepartments()) {
                for (Employee employee : department.getEmployees()) {
               for(Responsibility responsibility : employee.getResponsibilities() )
                    System.out.println(responsibility);
                }
            }
        }
    }
}
