import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    ArrayList<IReviewed> attractions;
    ArrayList<IReviewed> stalls;
    ArrayList<IReviewed> reviewed;

    public ThemePark() {
        this.attractions = new ArrayList<IReviewed>();
        this.stalls = new ArrayList<IReviewed>();
        this.reviewed = new ArrayList<IReviewed>();
    }
    public ArrayList<IReviewed> getAllReviewed(){
        return this.reviewed;
    }
    public ArrayList<IReviewed> getAllAttractions(){
        return this.attractions;
    }


    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }
    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public void addIReview(ArrayList<IReviewed> allReviews) {
        for(IReviewed revieweds:allReviews){
            this.reviewed.add(revieweds);}
    }

    public ArrayList<IReviewed> getAllStalls() {
        return this.stalls;
    }
    public int numberOfAllReviews(){
        return this.reviewed.size();
    }
    public void visit(Visitor visitor,Attraction attraction){
        attraction.setVisitCount(attraction.getVisitCount()+1);
        visitor.addAttraction(attraction);

    }


}
