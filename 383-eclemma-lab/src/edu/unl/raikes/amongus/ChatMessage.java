package edu.unl.raikes.amongus;

public class ChatMessage {

	private Player player;
	private String message;

	public ChatMessage(Player player, String message) {
		this.player = player;
		this.message = message;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString() {
		return String.format("%s: %s", player.getColor().toString(), message);
	}

}
