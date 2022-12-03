package Day16_11_20.homework.HARD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private String dateOfBirth;
    private String school;
    private int totalWorkExperience;
    private Address address;
    private PersonalDetails personalDetails;
    private BankDetails bankDetails;
    private Car car;

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("name= ").append(name).append("\n");
        sb.append("date of birth =").append(dateOfBirth).append("\n");
        sb.append("school=").append(school).append("\n");
        sb.append("total work experience =").append(totalWorkExperience).append("\n");
        sb.append("address=").append(address).append("\n");
        sb.append("personal details=").append(personalDetails).append("\n");
        sb.append("bank details=").append(bankDetails).append("\n");
        sb.append("car=").append(car).append("\n");
        return sb.toString();

    }
}
