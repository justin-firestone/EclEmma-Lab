package edu.unl.raikes.amongus;

import java.util.ArrayList;
import java.util.Random;

public class Lobby {
	private Random rand = new Random();

	private int lobbyCode;
	private ArrayList<Player> players;
	private ArrayList<ChatMessage> chat;

	public Lobby() {
		this.lobbyCode = rand.nextInt(9000) + 1000;
		this.players = new ArrayList<Player>();
		this.chat = new ArrayList<ChatMessage>();
	}

	public int getLobbyCode() {
		return lobbyCode;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void clearPlayers() {
		players.clear();
	}

	public void addPlayerToLobby(Player player) {
		this.players.add(player);
	}

	public ArrayList<ChatMessage> getChat() {
		return chat;
	}

	public void clearChat() {
		chat.clear();
	}

	public void addMessageToChat(ChatMessage message) {
		ChatMonitor.filterMessage(message);
		this.chat.add(message);
	}
}
