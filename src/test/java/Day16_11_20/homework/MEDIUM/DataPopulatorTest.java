package Day16_11_20.homework.MEDIUM;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DataPopulatorTest {

    @Test
    void shouldGenerate4Towns_WhenGivenNumberIs4() {
        DataPopulator dataPopulator = new DataPopulator();
        ArrayList<Town> towns = dataPopulator.populateData(4);
        assertEquals(4, towns.size());
        assertNotNull(towns.get(0).getName());
        assertNotNull(towns.get(0).getSchools());
        assertNotNull(towns.get(3).getSchools().get(0).getGroups());

    }
}