package lab2.ex2;

import org.springframework.context.ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task1Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab2/ex2/beans-config.xml");
		// start task1 here
		Product productA1 = (Product) context.getBean("productA");
		System.out.println(productA1.toString());

		// end task1
		
	}

}
