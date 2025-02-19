
public class TestResizeableCricle {

	public static void main(String[] args) {
		ResizeableCricle rc = new ResizeableCricle(10.0);
		System.out.println(rc);
		String frmResult = String.format("%.2f", rc.getPerimeter());
		System.out.println("Perimeter: " + frmResult);
		System.out.printf("Area: %.2f", rc.getArea());
		
		rc.resize(50);
		System.out.println("After resize(50%) : " + rc);
		System.out.println("Perimeter: " + frmResult);
		System.out.printf("Area: %.2f" , rc.getArea());
		
	}
	public static void Line() {
		for(int i=1; i<50;i++)
			System.out.print("-");
		System.out.println();
	}
}
