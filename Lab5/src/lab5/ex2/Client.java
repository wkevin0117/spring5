package lab5.ex2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab5/ex2/beans-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		Product p = productDao.getProduct(1);

		p.setName("Hibernate test3");

		p.setPrice(2);
		
		productDao.save(p);
		
		List<Product> list = productDao.getProducts();
		for (Product product : list) {
			System.out.println(product.getName());
		}

	}

}
