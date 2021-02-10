package edu.unl.raikes.amongus;

public class MainApplication {

	public static void main(String[] args) {
		Player player = new Player("Suspicious", PlayerColor.RED);
		int susScore = SuspiciousCalculator.getSuspiciousMetric(player);

		System.out.println(susScore);
	}

}
