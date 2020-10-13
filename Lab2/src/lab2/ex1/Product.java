package lab2.ex1;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Product {

	private String productId;

	private String name;

	private String description;
	
	private Product next;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public Product getNext() {
		return next;
	}

	public void setNext(Product next) {
		this.next = next;
	}
}
