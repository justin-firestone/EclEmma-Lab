package edu.unl.raikes.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unl.raikes.amongus.Player;
import edu.unl.raikes.amongus.SuspiciousCalculator;

public class SuspiciousCalculatorTests {

	@Test
	public void exampleTest() {
		Player player = null;
		int suspiciousScore = SuspiciousCalculator.getSuspiciousMetric(player);

		Assert.assertEquals(-1, suspiciousScore);
	}
}
