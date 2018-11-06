package tp;

public class Retangle {
	
	private Double height;
	private Double width;
	
	

	public Retangle() {
		// TODO Auto-generated constructor stub
	}



	public Retangle(Double h, Double w) {
		super();
		this.height = h;
		this.width = w;
	}
	
	public double surface() {
		
		return height * width;
	}
	
	public double perimeter() {
		
		return 2*(height + width);
	}
	
	public void showDimensions() {
		
		System.out.println("The area of the retangle is " + this.surface() + "\nThe perimeter of the retangle is " + this.perimeter() );
	}

}
