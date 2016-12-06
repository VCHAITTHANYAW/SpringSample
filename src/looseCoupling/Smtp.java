package looseCoupling;

public class Smtp implements Transport {
	public void sendMail(){
		System.out.println("Sending text mail......through Smtp");
	}
}
