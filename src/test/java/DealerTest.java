import Customer.Customer;
import Dealership.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class DealerTest {
    Car car;
    MotorCycle motorCycle;
    Dealer dealer;
    Engine engine;
    Gearbox gearbox;
    Customer customer;

    @Before
    public void before() {
        this.car = new Car(100000, "red", Engine.ELECTRIC, Gearbox.AUTOMATIC, 4);
        this.motorCycle = new MotorCycle(50000, "white", Engine.ELECTRIC, Gearbox.AUTOMATIC, 2);
        this.dealer = new Dealer();
        this.customer = new Customer(500000);

    }



    @Test
    public void canGetStock(){
        assertEquals(0,dealer.getStock().size());
    }


    @Test
    public void canAddStock(){
        dealer.addStock(car);
        assertEquals(1,dealer.getStock().size());
    }

    @Test
    public void canAddTwoToStock(){
        dealer.addStock(car);
        dealer.addStock(motorCycle);
        assertEquals(2,dealer.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        dealer.addStock(car);
        dealer.removeStock(car);
        assertEquals(0,dealer.getStock().size());
    }

    @Test
    public void canRemoveAllStock(){
        dealer.addStock(car);
        dealer.addStock(motorCycle);
        dealer.removeAllStock();
        assertEquals(0,dealer.getStock().size());
    }

    @Test
    public void canGetTill(){
        assertEquals(0,dealer.getTill());
    }


    @Test
    public void canAddToTill(){
        dealer.addTill(50);
        assertEquals(50,dealer.getTill());
    }


    @Test
    public void canSellCar(){
        dealer.addStock(car);
        dealer.sellCar(car.getPrice(),car);
        assertEquals(100000,dealer.getTill());
        assertEquals(0,dealer.getStock().size());
    }



}
