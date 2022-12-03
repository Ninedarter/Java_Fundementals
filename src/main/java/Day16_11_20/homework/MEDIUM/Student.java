package Day16_11_20.homework.MEDIUM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    private String name;
    private int age;
    private double gradeAverage;
    private int heightInCm;
    private int weightInKg;
    private ArrayList<Skill> skills;
}
