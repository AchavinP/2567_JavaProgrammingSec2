
public class ResizeableCricle extends Circle implements Resizeable{
	
	public ResizeableCricle(double radius) {
		super(radius);
		
	}
	@Override
	public void resize(int percent) {
		this.radius *= percent / 100.0;
	}
	
	public double resize() {
		return radius;
	}
	
	public String toString() {
		return "ResizeableCircle[" + super.toString() + "]";
	}
}

