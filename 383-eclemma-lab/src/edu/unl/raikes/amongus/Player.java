package edu.unl.raikes.amongus;

public class Player implements Comparable<Player> {

	private String name;
	private PlayerColor color;
	private int suspiciousScore;
	private int numberOfDeathsReported;
	private int numberOfTasksSeenCompleting;
	private int numberOfEmergenciesFixed;
	private int numberOfTimesSeenVenting;

	/**
	 * Represents a player in the game of Among Us.
	 * 
	 * @param name  the name of the player
	 * @param color the player's color
	 */
	public Player(String name, PlayerColor color) {
		this.name = name;
		this.color = color;
		this.suspiciousScore = 0;
		this.numberOfDeathsReported = 0;
		this.numberOfTasksSeenCompleting = 0;
		this.numberOfEmergenciesFixed = 0;
		this.numberOfTimesSeenVenting = 0;
	}
	
	public void postMessage(Lobby lobby, String text) {
		ChatMessage message = new ChatMessage(this, text);
		lobby.addMessageToChat(message);
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
	
	public int getSuspiciousScore() {
		return suspiciousScore;
	}
	
	public void calculateSuspiciousScore(Lobby lobby) {
		this.suspiciousScore = SuspiciousCalculator.getSuspiciousMetric(this, lobby);
	}
	
	public void reportDeath() {
		this.numberOfDeathsReported++;
	}
	
	public int getNumberOfDeathsReported() {
		return numberOfDeathsReported;
	}
	
	public void completedTask() {
		this.numberOfTasksSeenCompleting++;
	}
	
	public int getNumberOfTasksSeenCompleting() {
		return numberOfTasksSeenCompleting;
	}
	
	public void fixedEmergency() {
		this.numberOfEmergenciesFixed++;
	}
	
	public int getNumberOfEmergenciesFixed() {
		return numberOfEmergenciesFixed;
	}
	
	public void seenVenting() {
		this.numberOfTimesSeenVenting++;
	}
	
	public int getNumberOfTimesSeenVenting() {
		return numberOfTimesSeenVenting;
	}
	
	public String toString() {
		return name.toUpperCase();
	}
	
	@Override
	public int compareTo(Player pl) {
		if (pl.getSuspiciousScore() > suspiciousScore) {
			return 1;
		} else if (pl.getSuspiciousScore() < suspiciousScore) {
			return -1;
		} else {
			return 0;
		}
	}
}
