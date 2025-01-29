public class Product {

    private String name;
    private double price;
    private double vatRate;

    public void setProductDetails(String inputName, double inputPrice, double inputVatRate){
        name = inputName;
        price = inputPrice;
        vatRate = inputVatRate;
    }
    public double calculateTotalPrice() {
        return price + (price * (vatRate/100.0));
    }
    public void displayProductDetails() {
        System.out.println("Product Details:");
        System.out.println("Product Name: "+name);
        System.out.printf("Price (before VAT): %.1f", price);
        System.out.printf("\nPrice (after VAT): %.1f", calculateTotalPrice());
    }
}