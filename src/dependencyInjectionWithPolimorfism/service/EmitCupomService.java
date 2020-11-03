package dependencyInjectionWithPolimorfism.service;

import dependencyInjectionWithPolimorfism.notify.Notify;
import modelo.Client;

public class EmitCupomService {

	private Notify notiffy;

	public EmitCupomService(Notify notify) {
		this.notiffy = notify;
	}

	public void emit(Client c) {
		
		this.notiffy.notify(c, "%s Nota fiscal emitida para %s");
		
	}
}
