package lab2.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task1Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab2/ex3/beans-config.xml");
		Product product = (Product) context.getBean("product");
		product.getName(); // ���N�I�s�@��method�N�iĲ�oadvice
	}

}
