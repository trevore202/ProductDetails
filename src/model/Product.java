package model;

public class Product {

	private String name;
	private String details;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Product(String name, String details) {
		super();
		this.name = name;
		this.details = details;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", details=" + details + "]";
	}
	
	
	
}
