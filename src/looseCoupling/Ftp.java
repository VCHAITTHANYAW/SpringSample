package looseCoupling;

public class Ftp implements Transport {
	
	@Override
	public void sendMail(){
		System.out.println("Sending mail with attachment......through Ftp");
	}
}
