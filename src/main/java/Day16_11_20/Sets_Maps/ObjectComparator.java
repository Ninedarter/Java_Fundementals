package Day16_11_20.Sets_Maps;

import Day16_11_20.groupwork.Employee;
import Day16_11_20.groupwork.Seniority;

public class ObjectComparator {
    public static void main(String[] args) {
        Employee tomasVarkulevicius = new Employee("Tomas", Seniority.SENIOR,1000,null);
        Employee tomasVenskus= new Employee("Tomas",Seniority.SENIOR,1000,null);
        System.out.println(tomasVarkulevicius.equals(tomasVenskus));
    }
}
