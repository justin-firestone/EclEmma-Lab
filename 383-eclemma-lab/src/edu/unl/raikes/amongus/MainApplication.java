package edu.unl.raikes.amongus;

public class MainApplication {

	public static void main(String[] args) {
		Player[] players = { new Player("Player Red", PlayerColor.RED), new Player("Player Blue", PlayerColor.BLUE) };
		Lobby lobby = new Lobby(players);
		
		System.out.printf("The lobby code is: %s\n", lobby.getLobbyCode());
		System.out.printf("All players allowed: %s\n\n", lobby.getAllPlayersAllowed());
		
		players[0].reportDeath();
		players[0].completedTask();
		players[0].seenVenting();
		players[0].seenVenting();
		players[1].reportDeath();
		players[1].reportDeath();
		players[1].fixedEmergency();
		players[1].completedTask();
		players[1].completedTask();
				
		
		System.out.println("Chat Messages:");
		for (Player player: players) {
			int susScore = SuspiciousCalculator.getSuspiciousMetric(player, lobby);
			String chatMessage1 = String.format("My sus score is %d!", susScore);
			player.postMessage(lobby, chatMessage1);
			ImposterClassification classification = SuspiciousCalculator.getNaiveImposterClassificationPrediction(player);
			String chatMessage2 = String.format("%s?", classification.getClassification());
			player.postMessage(lobby, chatMessage2);
		}
		
		for (ChatMessage message: lobby.getChat()) {
			System.out.println(message);
		}
		
		
	}
}
