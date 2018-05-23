package Customer;

import Dealership.Car;
import Dealership.Vehicle;

import java.util.ArrayList;

public class Customer {

    protected int wallet;
    protected ArrayList<Vehicle> ownGarage;

    public Customer(int wallet){
        this.wallet = wallet;
        this.ownGarage = new ArrayList<>();
    }

    public int getWallet(){
        return this.wallet;
    }

    public ArrayList<Vehicle> getOwnGarage(){
        return this.ownGarage;
    }

    public void spendMoney(int money) {
        this.wallet -= money;
    }

    public void addToGarage(Vehicle vehicle) {
        this.ownGarage.add(vehicle);
    }

    public void buyCar(int money, Vehicle vehicle){
        spendMoney(money);
        addToGarage(vehicle);
    }
}
