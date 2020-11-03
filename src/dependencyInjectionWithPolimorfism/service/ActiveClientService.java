package dependencyInjectionWithPolimorfism.service;

import dependencyInjectionWithPolimorfism.notify.Notify;
import modelo.Client;

public class ActiveClientService {

	private Notify notify;
	
	public ActiveClientService(Notify notify) {
		this.notify = notify;
	}
	
	
	public void active(Client c) {
		c.setActive(true);
		
		this.notify.notify(c,"%s Ativação do cliente %s\n");
		
	}
}
