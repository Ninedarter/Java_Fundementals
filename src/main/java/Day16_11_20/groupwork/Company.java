package Day16_11_20.groupwork;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
@Data
@AllArgsConstructor
public class Company {
    private String name;
    private int budged;
    private String address;
   private  ArrayList<Department> departments;




}
