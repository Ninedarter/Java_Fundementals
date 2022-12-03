package Day16_11_20.homework.HARD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String street;
    private String city;
    private String country;
    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("street=").append(street).append("\n");
        sb.append("city=").append(city).append("\n");
        sb.append("country=").append(country).append("\n");
        return sb.toString();
    }
}
