package lab3.ex1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task3Client {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab3/ex1/beans-config.xml");
		// �Цb�U��g�@�@�q�{���X�A���oDataSource������A
		// �æL�X���N�ݩʭȡA�H���ո�Ʈw�O�_�s�q�C
		//
		Product p = new Product();
	}

}
