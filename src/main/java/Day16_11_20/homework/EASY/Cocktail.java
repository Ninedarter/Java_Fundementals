package Day16_11_20.homework.EASY;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cocktail {
    private String name;
    private double price;

    public Cocktail(String name) {
        this.name = name;
    }
}
