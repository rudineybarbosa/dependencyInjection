package dependencyInjectionWithPolimorfism.notify;

import modelo.Client;

public class NotifyBySMS implements Notify{
	
	private String type = "SMS";
	
	public void notify(Client c, String message) {
		System.out.printf(message, type, c.getName());
	}

}
