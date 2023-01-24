package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor smallChild;
    Visitor tallAdult;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        smallChild = new Visitor(10,100,0);
        tallAdult = new Visitor(31,220,100);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }
    @Test
    public void hasAbilityToStopPeople17OrYounger() {
        assertEquals(false, tobaccoStall.isAllowedTo(smallChild));
    }
    @Test
    public void hasAbilityAllowAdults18OrOver() {
        assertEquals(true, tobaccoStall.isAllowedTo(tallAdult));
    }
}
