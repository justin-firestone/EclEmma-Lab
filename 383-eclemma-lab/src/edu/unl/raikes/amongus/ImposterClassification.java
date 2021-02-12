package edu.unl.raikes.amongus;

public enum ImposterClassification {
	Imposter("Imposter"),
	NotImposter("Not Imposter");
	
	private String imposterClassification;
	
	ImposterClassification(String imposterClassification) {
		this.imposterClassification = imposterClassification;
	}
	
	public String getClassification() {
		return imposterClassification;
	}
}
