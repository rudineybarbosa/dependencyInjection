package dependencyInjectionWithoutPolimorfism;

import dependencyInjectionWithoutPolimorfism.service.AtivarClienteService;
import modelo.Client;

public class Main {

	/**
	 * Neste tipo de implementação, se for necessário adicionar outros tipos de notificações,
	 * por exemplo, por whatsapp, por telegram..., após concluir a implementação, o desenvolvedor
	 * precirá alterar todos os pontos que utilizam a implementação NotificarEmail().
	 * Exemplo: procurar por NotificarEmail() e alterar tudo para NotificarWhatsapp()
	 * 
	 * Para melhorar este código, podemos aplicar injeção de dependência com inversão de controle, de forma
	 * que o controle (a implementação 'NotificarEmail') sai da classe 'AtivarClienteService' e passa a ser
	 * injetada uma interface 'Notificar' em seu construtor 
	 * 
	 */
	public static void main(String[] args) {
		Client c = new Client("Rudiney", "rudiney@email", "81912523452");
		
		AtivarClienteService ativarClienteService = new AtivarClienteService();
		ativarClienteService.ativar(c);

	}

}
