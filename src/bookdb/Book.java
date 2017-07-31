package bookdb;

public class Book {
	
	private String sku;
	private String author;
	private String title;
	private String description;
	private double price;
	
	public void set(String sku, String author, String title, String description, double price){
		setSku(sku);
		setAuthor(author);
		setTitle(title);
		setDescription(description);
		setPrice(price);
	}
	
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
