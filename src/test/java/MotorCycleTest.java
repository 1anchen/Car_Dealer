import Dealership.Engine;
import Dealership.Gearbox;
import Dealership.MotorCycle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MotorCycleTest {

    MotorCycle motorCycle;
    Engine engine;
    Gearbox gearbox;

    @Before
    public void before(){
        this.motorCycle = new MotorCycle(5000,"white",Engine.DIESEL, Gearbox.MANUAL,2);

    }

    @Test
    public void canGetPrice(){
        assertEquals(5000,motorCycle.getPrice());

    }

    @Test
    public void canGetColour(){
        assertEquals("white",motorCycle.getColour());

    }

    @Test
    public void canGetEngine(){
        assertEquals(Engine.DIESEL,motorCycle.getEngine());

    }

    @Test
    public void canGetGearbox(){
        assertEquals(Gearbox.MANUAL,motorCycle.getGearbox());

    }

    @Test
    public void canGetNumberOfWheels(){
        assertEquals(2,motorCycle.getNumberOfWheels());

    }
}
