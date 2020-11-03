package dependencyInjectionWithPolimorfism.notify;

import modelo.Client;

public interface Notify {

	void notify(Client client, String message);
}
