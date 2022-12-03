package Day16_11_20.groupwork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private String name;
    /**
     * This is mandatory
     */
    @NonNull // privalomas laukas tampa director
    private String director;
    private ArrayList<Employee> employees ;





}
