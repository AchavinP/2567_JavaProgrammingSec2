import java.util.*;
public class TestProductInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Product vat1 = new Product();

        System.out.print("Enter product name: ");
        String vatName1 = scan.nextLine();
        System.out.print("Enter product price: ");
        double vatprice1 = scan.nextDouble();
        System.out.print("Enter VAT rate (%): ");
        double vatVatRate1 = scan.nextDouble();

        System.out.println();
        vat1.setProductDetails(vatName1, vatprice1, vatVatRate1);
        vat1.displayProductDetails();
    }
}