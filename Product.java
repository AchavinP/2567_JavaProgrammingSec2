
public class Product {
	private String Studentname;
	private double price;
	private double vatrate;
	
	public void setProductDetails(String inputname , double inputprice ,double inputvatRate ) {
		Studentname = inputname;
		price = inputprice;
		vatrate = inputvatRate;
	}
	
	public double calculateTotalPrice() {
		return (price+vatrate);
	}
	
	public void displayProductDetails() {
		System.out.println("Product Details: ");
		System.out.println("Product Name: " + Studentname);
		System.out.println("Price (before VAT): " + price);
		System.out.println("Price (after VAT): " + calculateTotalPrice());
	}

}
