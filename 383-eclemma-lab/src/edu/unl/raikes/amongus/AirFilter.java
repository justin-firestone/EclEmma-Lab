package edu.unl.raikes.amongus;

import java.util.Random;

public class AirFilter {
    
    public boolean isClean;
    private Random rnd = new Random();

    public AirFilter(boolean isClean){
        this.isClean = isClean;
    }

    public void cleanFilter(){
        int diceRoll = rnd.nextInt(10)+1;
        if (diceRoll>5){
            this.isClean = true;
        }
    }

    public boolean checkFilter(){
        return this.isClean;
    }

     
}
