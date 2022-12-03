package Day16_11_20.homework.MEDIUM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Skill {
    private String name;
    private String description;
    private Difficulty difficulty;

}
