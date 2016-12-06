package tightcoupling;

public class TightCoupling {
	
	Smtp smtp = new Smtp();
	
	public void send(){
		System.out.println("Mail Sending in Proces.......");
		smtp.sendMail();
	}

}
