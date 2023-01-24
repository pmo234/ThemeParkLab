package people;

import attractions.Attraction;
import attractions.Dodgems;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> attractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.attractions = new ArrayList<Attraction>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }
    public int numberOfAttractions(){
        return this.attractions.size();
    }
}
