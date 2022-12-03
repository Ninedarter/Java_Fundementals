package Day16_11_20.groupwork;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
@Data
@AllArgsConstructor
public class Employee {

    private String name;
    // cia yra mano paties sukurtas ENUMas
    private Seniority seniority;
    private int salary;
    private ArrayList<Responsibility> responsibilities;

}
