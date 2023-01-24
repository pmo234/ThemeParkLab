package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor smallChild;
    Visitor tallAdult;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        smallChild = new Visitor(10,100,0);
        tallAdult = new Visitor(31,220,100);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }
    @Test
    public void hasAbilityToStopPeople16OrOlder() {
        assertEquals(false, playground.isAllowedTo(tallAdult));
    }
    @Test
    public void hasAbilityAllowChildren15OrUnder() {
        assertEquals(true, playground.isAllowedTo(smallChild));
    }
}
