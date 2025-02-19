package java_lab9;

public class Theater extends Movie {//keyword extends แสดงว่าเป็น subclass ของคลาสอะไรอยู่
	private int theaterNo;
	
	Theater(String id, String name, Director director, int theaterNO){
		super(id,name,director);//keyword super ใช้อ้างอิงถึงคลาสแม่ อันนี้อ้างอิงแอดทีบิวที่ที่เป็นคลาสแม่
		this.theaterNo = theaterNO;
	}
	Theater(){
		this.theaterNo = 0;
	}
	public String getTheaterName() {
		if(theaterNo  >=1&& theaterNo<=11) {
			return "Basic Theater" ;
		}
		else if(theaterNo>=12 && theaterNo<=14) {
			return  "Sweet Theater";
		}
		else if (theaterNo == 15) {
			return "Premium Theater";
		}
		else {
			return null;
		}
	}
	public String toSring() {
		return getTheaterName()+": "+super.toString();//super อันนี้เรียกเรียกใช้ method ในคลาสแม่
	}

}