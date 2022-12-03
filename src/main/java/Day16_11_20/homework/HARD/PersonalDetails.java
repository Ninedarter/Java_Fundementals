package Day16_11_20.homework.HARD;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class PersonalDetails {

    private double height;
    private double weight;
    private boolean hasInjuries;


    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("height=").append(height).append("\n");
        sb.append("weight=").append(weight).append("\n");
        sb.append("hasInjuries=").append(hasInjuries).append("\n");
        return sb.toString();
    }
}
