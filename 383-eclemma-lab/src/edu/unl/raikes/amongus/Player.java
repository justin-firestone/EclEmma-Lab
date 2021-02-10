package edu.unl.raikes.amongus;

public class Player {

	private String name;
	private PlayerColor color;

	/**
	 * Represents a player in the game of Among Us.
	 * 
	 * @param name  the name of the player
	 * @param color the player's color
	 */
	public Player(String name, PlayerColor color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlayerColor getColor() {
		return color;
	}

	public void setColor(PlayerColor color) {
		this.color = color;
	}
}
