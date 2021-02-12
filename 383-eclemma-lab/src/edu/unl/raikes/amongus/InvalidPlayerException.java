package edu.unl.raikes.amongus;

public class InvalidPlayerException extends Exception {
	
	public InvalidPlayerException() {
		super();
	}
	
	public InvalidPlayerException(String msg) {
		super(msg);
	}
	
	public InvalidPlayerException(String msg, Exception inner) {
		super(msg, inner);
	}
}
