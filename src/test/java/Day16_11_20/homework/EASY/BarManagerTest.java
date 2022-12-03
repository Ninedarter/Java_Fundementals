package Day16_11_20.homework.EASY;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BarManagerTest {

    @BeforeClass
    ArrayList<Bartender> sampleBartenders(){


        ArrayList<String> oneBar = new ArrayList<>();
        oneBar.add("barNr1");

        ArrayList<String> twoBars = new ArrayList<>();
        twoBars.add("barNr1");
        twoBars.add("barNr2");

        ArrayList<String> threeBars = new ArrayList<>();
        threeBars.add("barNr1");
        threeBars.add("barNr2");
        threeBars.add("barNr3");

        Bartender bartender1 = new Bartender("Andrius",1,900,oneBar);
        Bartender bartender2 = new Bartender("Jokub",5,1500,twoBars);
        Bartender bartender3 = new Bartender("Ben",5,1900,threeBars);
        Bartender bartender4 = new Bartender("Ken",4,1900,twoBars);
        Bartender bartender5 = new Bartender("Ryan",1,1100,oneBar);
        ArrayList<Bartender> sampleBartenders = new ArrayList<>();
        sampleBartenders.add(bartender1);
        sampleBartenders.add(bartender2);
        sampleBartenders.add(bartender3);
        sampleBartenders.add(bartender4);
        sampleBartenders.add(bartender5);
        return sampleBartenders;
    }
    BarManager barManager = new BarManager();
    @Test
    void findMostExperiencedBartender() {
        ArrayList<Bartender> actualMostExperienced = new ArrayList<>();

        actualMostExperienced = barManager.findMostExperiencedBartender(sampleBartenders());

        assertEquals("Jokub",actualMostExperienced.get(0).getName());
        assertEquals(1500,actualMostExperienced.get(0).getSalary());
        assertEquals(2,actualMostExperienced.size());

    }

    @Test
    void findMostExpensiveBartender() {

        ArrayList<Bartender> actualMostExpensive = new ArrayList<>();
        actualMostExpensive = barManager.findMostExpensiveBartender(sampleBartenders());
        assertEquals(2,actualMostExpensive.size());
        assertEquals("Ken", actualMostExpensive.get(1).getName());
        assertEquals(1900, actualMostExpensive.get(0).getSalary());

    }

    @Test
    void findBartenderWithLowestExperience() {

        ArrayList<Bartender> actualLowestExperienced = new ArrayList<>();
        actualLowestExperienced = barManager.findBartenderWithLowestExperience(sampleBartenders());
        assertEquals(2,actualLowestExperienced.size());
        assertEquals(1,actualLowestExperienced.get(0).getExperienceInYears());
        assertEquals(1,actualLowestExperienced.get(1).getExperienceInYears());
        assertEquals("Andrius", actualLowestExperienced.get(0).getName());
        assertEquals("Ryan", actualLowestExperienced.get(1).getName());
    }
}