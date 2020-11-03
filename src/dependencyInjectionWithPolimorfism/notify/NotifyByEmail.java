package dependencyInjectionWithPolimorfism.notify;

import modelo.Client;

public class NotifyByEmail implements Notify{

	private String type = "Email";
	
	public void notify(Client c, String mensagem) {
		System.out.printf(mensagem, type, c.getName());
	}

}
