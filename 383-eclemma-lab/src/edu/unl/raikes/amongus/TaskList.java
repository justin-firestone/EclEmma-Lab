package edu.unl.raikes.amongus;

import java.util.ArrayList;
import java.util.Random;

public class TaskList {

    Beverage beverage = new Beverage(50);
    Computer computer = new Computer(false);
    AirFilter filter = new AirFilter(false);
    Vent vent = new Vent(false);
    ArrayList<Integer> tasks;
    

    public TaskList(ArrayList<Integer> tasks ){
        Random rnd = new Random();
        this.tasks = new ArrayList<Integer>();
        int number = rnd.nextInt(4)+1;
        int number2 = rnd.nextInt(4)+1;
        int number3 = rnd.nextInt(4)+1;
        int number4 = rnd.nextInt(4)+1;
        tasks.add(number);
        tasks.add(number2);
        tasks.add(number3);
        tasks.add(number4);
    }

    public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public AirFilter getFilter() {
		return filter;
	}

	public void setFilter(AirFilter filter) {
		this.filter = filter;
	}

	public Vent getVent() {
		return vent;
	}

	public void setVent(Vent vent) {
		this.vent = vent;
	}

	public ArrayList<Integer> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Integer> tasks) {
		this.tasks = tasks;
	}

	public void completeTask(int i){
        switch(i){
            case 1:
                int coin = 0; 
                while(this.beverage.buyBeverage(coin) == false){
                    coin++;
                }
                break;
            case 2:
                while(this.computer.checkWires() == false){
                    this.computer.fixWires();
                }
                break;
            case 3:
                while(this.filter.checkFilter() ==false){
                    this.filter.cleanFilter();
                }
                break;
            default:
                while(this.vent.checkVent() == false){
                    this.vent.cleanVent();
                }
        }
    }
    public void completeTasks(){
        for (int i = 0; i < this.tasks.size(); i++){
            completeTask((this.tasks.get(i)));
        }

    }
}
