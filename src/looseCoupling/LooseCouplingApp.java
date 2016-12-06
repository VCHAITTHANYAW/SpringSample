package looseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*LooseCoupling looseCoupling = new LooseCoupling();
		looseCoupling.setTransport(new Ftp());
		looseCoupling.send();*/
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		
		LooseCoupling looseCoupling = (LooseCoupling)applicationContext.getBean("transport");
		looseCoupling.send();
		
	}
}
