package people;

import attractions.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    ArrayList<Attraction> attractions;


    @Before
    public void before(){
        visitor = new Visitor(14, 120, 40.0);
        park = new Park("The Park",5);
        dodgems = new Dodgems("Bash Boyz",4);
        playground = new Playground("The Park?",1);
        rollerCoaster = new RollerCoaster("JKLMAO",5);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(120, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }
    @Test
    public void hasAttractionsTheyHaveVisited() {
        visitor.addAttraction(dodgems);
        visitor.addAttraction(park);
        visitor.addAttraction(rollerCoaster);
        visitor.addAttraction(playground);
        assertEquals(4, visitor.numberOfAttractions());
    }

}
