package dependencyInjectionWithoutPolimorfism.notify;

import modelo.Client;

public class NotificarEmail{

	public void notificar(Client c, String mensagem) {
		System.out.printf(mensagem, "Email", c.getName());
	}

}
