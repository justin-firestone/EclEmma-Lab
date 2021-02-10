package edu.unl.raikes.amongus;

public class MainApplication {

	public static void main(String[] args) {
		Lobby lobby = new Lobby();
		
		Player player = new Player("Suspicious", PlayerColor.RED);
		lobby.addPlayerToLobby(player);
		
		int susScore = SuspiciousCalculator.getSuspiciousMetric(player);
		String chatMessage = String.format("My sus score is %d!", susScore);
		player.postMessage(lobby, chatMessage);

		System.out.println(lobby.getChat().get(0));
	}
}
