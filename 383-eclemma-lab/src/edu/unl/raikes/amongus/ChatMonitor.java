package edu.unl.raikes.amongus;

public class ChatMonitor {
	
	private final static int MAX_MESSAGE_LENGTH = 20;
	
	public static void filterMessage(ChatMessage message) {
		removeSpecialCharacters(message);
		
		if (message.getMessage().length() > MAX_MESSAGE_LENGTH) {
			trimMessageLength(message);
		}
	}
	
	public static void removeSpecialCharacters(ChatMessage message) {
		String pattern = "[!?$]";
		String modifiedMessage = message.getMessage().replaceAll(pattern, "");
		
		message.setMessage(modifiedMessage);
	}
	
	public static void trimMessageLength(ChatMessage message) {
		String modifiedMessage = message.getMessage().substring(0, MAX_MESSAGE_LENGTH);
		message.setMessage(modifiedMessage);
	}
}
