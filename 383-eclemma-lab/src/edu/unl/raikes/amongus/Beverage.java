package edu.unl.raikes.amongus;

public class Beverage {
    private int cost;
    public Beverage(int cost){
        this.cost = cost;
    }
    
    public boolean buyBeverage(int money){
        if(money>=cost){
            return true;
        }
        return false;
    }
}
