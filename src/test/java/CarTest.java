import Dealership.Car;
import Dealership.Engine;
import Dealership.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Gearbox gearbox;

    @Before
    public void before(){
        this.car = new Car(10000,"red",Engine.ELECTRIC, Gearbox.AUTOMATIC,4);

    }

    @Test
    public void canGetPrice(){
        assertEquals(10000,car.getPrice());

    }

    @Test
    public void canGetColour(){
        assertEquals("red",car.getColour());

    }

    @Test
    public void canGetEngine(){
        assertEquals(Engine.ELECTRIC,car.getEngine());

    }

    @Test
    public void canGetGearbox(){
        assertEquals(Gearbox.AUTOMATIC,car.getGearbox());

    }

    @Test
    public void canGetNumberOfWheels(){
        assertEquals(4,car.getNumberOfWheels());

    }
}
