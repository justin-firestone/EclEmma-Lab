package edu.unl.raikes.amongus;

import java.util.Random;

public class Vent {
    public boolean isClean;
    private Random rnd = new Random();

    public Vent(boolean isClean){
        this.isClean = isClean;
    }

    //trys to clean the vent
    public void cleanVent(){
        int diceRoll = rnd.nextInt(10)+1;
        if (diceRoll>5){
            this.isClean = true;
        }
    }

    public boolean checkVent(){
        return this.isClean;
    }

    
}
