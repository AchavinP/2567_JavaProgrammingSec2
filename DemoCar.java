
public class DemoCar {

	public static void main(String[] args) {
		Car car = new Car("Chevrolet" , "Cruze" , 2009,150000.0);
		car.output();
		car.Mileage();
		Spacing();
		System.out.println("Update Car Details:");
		car.setCompanyName("Toyota");
		car.setModelName("Corolla");
		car.setYear(2015);
		car.output();
		car.setYear(0);
		car.setCompanyName(null);
		
	}
	public static void Spacing() {
		System.out.println();
	}
}
