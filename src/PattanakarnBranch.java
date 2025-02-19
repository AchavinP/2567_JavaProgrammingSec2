package java_lab9;

public class PattanakarnBranch extends Product {//keyword extends แสดงว่าเป็น subclass ของคลาสอะไรอยู่
	private int payUnit() {
		return super.getUnit();//super อันนี้เรียกเรียกใช้ method ในคลาสแม่
	}
	private int freeUnit() {
		return super.getUnit();//super อันนี้เรียกเรียกใช้ method ในคลาสแม่
	}
	public int getTotalprice() {
		return payUnit() * 100;
	}
	public String toString() {
		return "You bay " + payUnit() + " unit, get free "+freeUnit()+ " unit (" + getTotalprice()+").";
	}
}
