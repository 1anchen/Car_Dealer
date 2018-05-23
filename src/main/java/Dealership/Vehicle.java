package Dealership;

import Dealership.Engine;
import Dealership.Gearbox;

public abstract class Vehicle {

    protected int price;
    protected String colour;
    protected Engine engine;
    protected Gearbox gearbox;
    protected int numberOfWheels;

    public Vehicle(int price, String colour, Engine engine, Gearbox gearbox, int numberOfWheels){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.gearbox = gearbox;
        this.numberOfWheels = numberOfWheels;

    }

    public int getPrice(){
        return this.price;
    }

    public String getColour(){
        return this.colour;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Gearbox getGearbox(){
        return this.gearbox;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }


}
