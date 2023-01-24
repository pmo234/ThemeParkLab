import attractions.*;
import behaviours.IReviewed;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;

public class ThemeParkTest extends TestCase {
    ArrayList<IReviewed> reviewed;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    ParkingSpot parkingSpot;
    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor smallChild;
    Visitor smallAdult;
    Visitor tallAdult;

    @Before
    public void setUp() throws Exception {
        themePark = new ThemePark();
        visitor = new Visitor(14, 120, 40.0);
        smallChild = new Visitor(10,100,0);
        tallAdult = new Visitor(31,220,100);
        smallAdult = new Visitor(59,140,100);
        park = new Park("The Park",5);
        dodgems = new Dodgems("Bash Boyz",4);
        playground = new Playground("The Park?",1);
        rollerCoaster = new RollerCoaster("JKLMAO",5);
        candyflossStall = new CandyflossStall("Non-tobacco Candy Floss","Norbert",ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Non-tobacco Ice Cream","Notbert",ParkingSpot.A2);
        tobaccoStall = new TobaccoStall("Non-tobacco Tobacco","Kindabert",ParkingSpot.A3);
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playground);
        themePark.addAttraction(rollerCoaster);
        themePark.addStall(candyflossStall);
        themePark.addStall(iceCreamStall);
        themePark.addStall(tobaccoStall);
        themePark.addIReview(themePark.getAllAttractions());
        themePark.addIReview(themePark.getAllStalls());
    }

    @Test
    public void testGetAllReviewed() {


        assertEquals(7,themePark.numberOfAllReviews());
    }
    @Test
    public void testAttractionGetsVisitedANumberOfTimes() {
        themePark.visit(visitor,dodgems);
        themePark.visit(smallAdult,dodgems);
        themePark.visit(smallChild,dodgems);
        themePark.visit(tallAdult,dodgems);


        assertEquals(4,dodgems.getVisitCount());
    }
    @Test
    public void testAVisitorVisitsManyAttractions() {
        themePark.visit(visitor,dodgems);
        themePark.visit(visitor,park);
        themePark.visit(visitor,playground);



        assertEquals(3,visitor.numberOfAttractions());
    }

}