package Day16_11_20.homework.HARD;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ConvertJsonToArrayList {
    public List<Person> getDataFromJson() {
        List<Person> personsList = null;
        try {
            byte[] mapData = Files.readAllBytes(Paths.get("src/main/resources/people.json"));
            Person[] personArr = null;

            ObjectMapper objectMapper = new ObjectMapper();
            personArr = objectMapper.readValue(mapData, Person[].class);
            personsList = Arrays.asList(personArr);
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return personsList;
    }
}

