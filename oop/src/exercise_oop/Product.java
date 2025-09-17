package exercise_oop;

public class Product {
	private String name;
	private double price;
	private double tax;

	Product() {
	}

	Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}

	public Product nhapThongTin(String name, double price, double tax) {
		Product crPr = new Product(name, price, tax);
		System.out.println(crPr);
		return crPr;
	}

	public void xuatThongTin(Product pr) {
		System.out.println(pr);
	}

	public double getTaxPrice(double price, double tax) {
		return 0;
	}

}
