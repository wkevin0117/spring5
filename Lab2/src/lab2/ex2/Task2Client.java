package lab2.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task2Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab2/ex2/beans-config.xml");
		
        // start task2 here
		Product productA1 = (Product) context.getBean("productA");
		Product productA2 = (Product) context.getBean("productA");
		Product productB1 = (Product) context.getBean("productB");
		Product productB2 = (Product) context.getBean("productB");
        
		System.out.println("����productA1�PproductA2���O�����m�O�_�ۦP:"+(productA1 == productA2));
		
		System.out.println("����productB1�PproductB2���O�����m�O�_�ۦP:"+(productB1 == productB2));
		
		// end task2
	}

}
