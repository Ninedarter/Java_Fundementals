package Day16_11_20.homework.HARD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDetails {

    private String swift;
    private String creditCard;
    private double balance;
    private String currency;


    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("swift=").append(swift).append("\n");
        sb.append("creditCard=").append(creditCard).append("\n");
        sb.append("balance=").append(balance).append("\n");
        sb.append("currency=").append(currency).append("\n");
        return sb.toString();
    }
}
