import Dealership.*;
import Customer.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Car car;
    MotorCycle motorcycle;
    Dealer dealer;
    Customer customer;
    Engine engine;
    Gearbox gearbox;

    @Before
    public void before(){
        this.car = new Car(100000,"red",Engine.ELECTRIC, Gearbox.AUTOMATIC,4);
        this.motorcycle = new MotorCycle(5000,"white",engine, gearbox,2);
        this.dealer = new Dealer();
        this.customer = new Customer(500000);
    }

    @Test
    public void canGetWallet(){
        assertEquals(500000,customer.getWallet());
    }

    @Test
    public void canGetOwnGarage(){
        assertEquals(0,customer.getOwnGarage().size());
    }

    @Test
    public void canSpendMoney(){
        customer.spendMoney(500000);
        assertEquals(0,customer.getWallet());
    }

    @Test
    public void canAddToGarage(){
        customer.addToGarage(car);
        assertEquals(1,customer.getOwnGarage().size());
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(car.getPrice(),car);
        assertEquals(1,customer.getOwnGarage().size());
        assertEquals(400000,customer.getWallet());
    }



}
