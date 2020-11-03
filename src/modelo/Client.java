package modelo;

public class Client {

	private String name;
	private String email;
	private String phone;
	private boolean isActive;
	
	public Client() {
		
	}
	
	public Client(String nome, String email, String telefone) {
		super();
		this.name = nome;
		this.email = email;
		this.phone = telefone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
