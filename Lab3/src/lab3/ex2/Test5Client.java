package lab3.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab3/ex2/beans-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
	    // 在下面加入程式碼
		Product p = new Product();
		p.setProductId(1);
		p.setName("dog3");
		p.setDescription("dog no.3");
		productDao.update(p);
	}

}
