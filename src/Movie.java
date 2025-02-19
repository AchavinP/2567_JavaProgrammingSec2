package java_lab9;

public class Movie {
	//ถูกอ้างอิงอยู่จาก subclass
	private String id;
	private String name;
	private Director director;
	
	Movie(String id, String name, Director director){
		this.id = id;
		this.name = name;
		this.director = director;
	}
	Movie(){
		
		//this();ไม่รู้เหมือนกันว่าเขียนไรต่อแต่มันไม่error
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public Director getDirector() {
		return this.director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public String toString() {
		return getId() + getName()+" direct by "+ director.toString();
	}
}