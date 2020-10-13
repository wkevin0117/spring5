package lab2.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task3Client {

	public static void main(String[] args) {
		// -- Lab Ex1 Task3-1 Start -- //
		ApplicationContext context = new ClassPathXmlApplicationContext("lab2/ex1/beans-config.xml");
		Product aa = (Product) context.getBean("productA");
		System.out.println(aa.toString());
        // -- Lab Ex1 Task3-1 End -- //
	}

}
