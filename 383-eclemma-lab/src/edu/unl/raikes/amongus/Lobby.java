package edu.unl.raikes.amongus;

import java.util.ArrayList;
import java.util.Random;

public class Lobby {
	private int lobbyCode;
	private boolean allPlayersAllowed;
	private ArrayList<Player> players;
	private ArrayList<ChatMessage> chat;

	public Lobby() {
		this.lobbyCode = this.createRandomLobbyCode(new Random());
		this.allPlayersAllowed = true;
		this.players = new ArrayList<Player>();
		this.chat = new ArrayList<ChatMessage>();
	}
	
	public Lobby(Player[] players) {
		this();
		this.populatePlayersList(players);
	}
	
	public Lobby(Player[] players, long randomSeed) {
		this.lobbyCode = this.createRandomLobbyCode(new Random(randomSeed));
		this.allPlayersAllowed = true;
		this.players = new ArrayList<Player>();
		this.chat = new ArrayList<ChatMessage>();
		this.populatePlayersList(players);
	}
	
	private int createRandomLobbyCode(Random rand) {
		return rand.nextInt(90000) + 1000;
	}
	
	private void populatePlayersList(Player[] players) {
		for (Player p: players) {
			try {
				this.addPlayerToLobby(p);
			} catch (InvalidPlayerException e) {
				this.allPlayersAllowed = false;
			}
		}
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

	public void addPlayerToLobby(Player player) throws InvalidPlayerException {
		for (Player p: players) {
			if (player.getColor() == p.getColor()) {
				throw new InvalidPlayerException("Two players can not be same color!");
			}
		}
		
		this.players.add(player);
	}
	
	public boolean getAllPlayersAllowed() {
		return this.allPlayersAllowed;
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
