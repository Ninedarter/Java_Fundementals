package Day16_11_20.homework.HARD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String brand;
    private String make;
    private String type;
    private int price;

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("brand=").append(brand).append("\n");
        sb.append("make=").append(make).append("\n");
        sb.append("type=").append(type).append("\n");
        sb.append("price=").append(price).append("\n");
        return sb.toString();
    }
}
