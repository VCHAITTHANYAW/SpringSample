package looseCoupling;

public class LooseCoupling {
	
	private Transport transport;
	
	public Transport getTransport() {
		return transport;
	}
	public void setTransport(Transport transport) {
		this.transport = transport;
	}


 void send(){
		System.out.println("Mail Sending in Proces.......");
		transport.sendMail();
	}
}
