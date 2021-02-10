package edu.unl.raikes.amongus;

public class SuspiciousCalculator {

	/*
	 * Calculate a percentage representing the suspiciousness of a player. Returns
	 * suspicious percentage, -1 if player is null.
	 */
	public static int getSuspiciousMetric(Player player) {
		if (player == null) {
			return -1;
		}

		int playerNameLength = player.getName().length();
		int playerColorLength = player.getColor().getColorString().length();

		int suspiciousScore = (int) (100 * (playerColorLength / (double) playerNameLength));
		return suspiciousScore;
	}
}
