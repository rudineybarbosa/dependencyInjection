package dependencyInjectionWithPolimorfism;

import dependencyInjectionWithPolimorfism.notify.Notify;
import dependencyInjectionWithPolimorfism.notify.NotifyBySMS;
import dependencyInjectionWithPolimorfism.service.ActiveClientService;
import dependencyInjectionWithPolimorfism.service.EmitCupomService;
import modelo.Client;

public class Main {

	public static void main(String[] args) {
		Client c = new Client("Rudiney", "rudiney@email", "00900000000");
		
		Notify notify = new NotifyBySMS();
		ActiveClientService activeClientService = new ActiveClientService(notify);
		activeClientService.active(c);

		EmitCupomService emitCupomService = new EmitCupomService(notify);
		emitCupomService.emit(c);

	}

}
