package Dealership;

import java.util.ArrayList;

public class Dealer {
    protected ArrayList<Vehicle> stock;
    protected int till;

    public Dealer(){
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public ArrayList<Vehicle> getStock() {
        return this.stock;
    }



    public void addStock(Vehicle vehicle) {
        this.stock.add(vehicle);
    }

    public void removeStock(Vehicle vehicle) {
        this.stock.remove(vehicle);
    }

    public void removeAllStock() {
        this.stock.clear();
    }

    public int getTill(){
        return this.till;
    }

    public void addTill(int money) {
        this.till += money;
    }

    public void sellCar(int money, Vehicle vehicle){
        removeStock(vehicle);
        addTill(money);
    }
}
