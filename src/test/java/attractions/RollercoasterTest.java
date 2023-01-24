package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor smallChild;
    Visitor tallAdult;
    Visitor smallAdult;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        smallChild = new Visitor(10,100,0);
        tallAdult = new Visitor(31,220,100);
        smallAdult = new Visitor(59,140,100);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    @Test
    public void hasNormalPriceForBelow200cm() {

        assertEquals(8.50, rollerCoaster.priceFor(smallChild),0.00);
    }
    @Test
    public void hasDoublePriceFor200cmOrOver() {

        assertEquals(17, rollerCoaster.priceFor(tallAdult),0.00);
    }
    @Test
    public void hasAbilityToStopPeople12OrYounger() {
        assertEquals(false, rollerCoaster.isAllowedTo(smallChild));
    }
    @Test
    public void hasAbilityToStopPeopleUnder145cm() {
        assertEquals(false, rollerCoaster.isAllowedTo(smallAdult));
    }
    @Test
    public void hasAbilityAllowPeopleOver12And145cm() {
        assertEquals(true, rollerCoaster.isAllowedTo(tallAdult));
    }
}
