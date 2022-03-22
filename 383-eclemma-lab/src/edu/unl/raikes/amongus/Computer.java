package edu.unl.raikes.amongus;

import java.util.Random;

public class Computer {
    private boolean wiresAreWorking;
    private Random rnd = new Random();

    public Computer(boolean wireStatus){
        this.wiresAreWorking = true;
    }

    public boolean checkWires(){
        return this.wiresAreWorking;
    }

    public void fixWires(){
        int diceRoll = rnd.nextInt(10)+1;
        if (diceRoll>5){
            this.wiresAreWorking = true;
        }
    }
}
