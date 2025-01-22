
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	//Constructor
	
	Car() {
		/*companyName = "Unknow";
		modelName = "Unknow";
		year = 2000;
		mileage = 0.0;*/
		this("Unknow","Unknow",2000,0.0);
	}
	
	//Parameterize Constructor
	Car(String companyName,String modelName,int year,double mileage) {
		this.companyName = companyName;
		this.modelName = modelName;
		//Default 2000
		this.year = year<1886? 2000:year;
		
		this.mileage = mileage;
		
	}
	
	//getters and setters method()
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}else {
			System.out.println("Error: Invalid company name");
		}
		
	}
	
	public void setModelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}else {
			System.out.println("Error: Invalid company name");
		}
	}
	
	public void setYear(int year) {
		if (this.year < 1886) {
			System.out.println("Error: Invalid year!");
		}
		else {
			this.year = year;
		}
	}
	
	
	public String getCompanyName() {
		return this.companyName;
	}
	public String getModelName() {
		return this.modelName;
	}
	public int getYear() {
		return this.year;
	}
	public double getMileage() {
		return this.mileage;
	}
	public void Mileage() {
		System.out.println("Mileage: " + this.getMileage());
	}
	public void output() {
		System.out.println("Company Name: " + this.getCompanyName());
		System.out.println("Model Name: " + this.getModelName());
		System.out.println("Year: " + this.getYear());
		//System.out.println("Mileage: " + this.getMileage());
	}
	 
	
}
