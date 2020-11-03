package dependencyInjectionWithoutPolimorfism.service;

import dependencyInjectionWithoutPolimorfism.notify.NotificarEmail;
import modelo.Client;

public class AtivarClienteService {

	public void ativar(Client c) {
		c.setActive(true);
		
		NotificarEmail notificar = new NotificarEmail();
		
		notificar.notificar(c, "%s ativação do cliente %s\n");
		
	}
}
