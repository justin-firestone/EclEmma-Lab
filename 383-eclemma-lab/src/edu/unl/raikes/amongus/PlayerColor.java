package edu.unl.raikes.amongus;

public enum PlayerColor {
	RED("Red"),
	BLUE("Blue"),
	YELLOW("Yellow"),
	GREEN("Green"),
	PURPLE("Purple"),
	CYAN("Cyan");
	
	private String color;
	
	PlayerColor(String color){
		this.color = color;
	}
	
	public String getColorString() {
		return color;
	}
}
