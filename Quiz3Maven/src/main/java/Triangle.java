
public class Triangle extends GeometricObject {
	// create fields and defaults
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	// no arg constructor 
	private Triangle() {
		super();
		this.side1=1;
		this.side2=1;
		this.side3=1;
		
	}
	/// constructor with specified values 
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}


	// create accessors 
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}


// getArea() method using heron's formula 
	@Override
	public double getArea() {
		double perimeter;
		double a;
		double b;
		double c;
		double p;
		double calcPerimeter;
		double area;
		perimeter = (this.getSide1()+this.getSide2()+this.getSide3())/2;
		a =(perimeter-this.getSide1());
		b=(perimeter-this.getSide2());
		c=(perimeter-this.getSide3());
		calcPerimeter= perimeter*a*b*c;
		area = Math.sqrt(calcPerimeter);


		return area;
	}
	
/// getPerimeter method 
	@Override
	public double getPerimeter() {
		double perimeter;
		perimeter = (this.getSide1()+this.getSide2()+this.getSide3());
		return perimeter;
	}
// returns a string of the all sides separate values 
	public String toString(){
		String stringOfSides;
		stringOfSides= "Side 1: " + this.getSide1() + "Side 2: " + this.getSide2()+ "Side 3: " + this.getSide3();
		return stringOfSides;
		
	}

}
