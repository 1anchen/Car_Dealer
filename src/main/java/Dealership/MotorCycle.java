package Dealership;

import Dealership.Engine;
import Dealership.Gearbox;

public class MotorCycle extends Vehicle {

    public MotorCycle(int price, String colour, Engine engine, Gearbox gearbox, int numberOfWheels){
        super(price,colour,engine,gearbox, numberOfWheels);
    }
}
