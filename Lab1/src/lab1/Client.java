package lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static final int INPUT1 = 3;
	public static final int INPUT2 = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new ClassPathXmlApplicationContext("beans-config.xml");
		Calculator calculator = (Calculator) container.getBean("calculator");
		Calculator calculator2 = (Calculator) container.getBean("calculator3");
		System.out.println(INPUT1 + calculator.getSymbol() + INPUT2 + "=" + calculator.calculate(INPUT1, INPUT2));
		System.out.println(INPUT1 + calculator2.getSymbol() + INPUT2 + "=" + calculator2.calculate(INPUT1, INPUT2));

	}

}
