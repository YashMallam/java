package practice;

public class Rectangle {
	
	double length;
	double breadth;
	
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
		
	}
	double PrintArea() {
		return length*breadth;
	}
	double PrintPerimeter() {
		return 2*(length*breadth);
	}
	//double PrintDiagonal() {
	//	return ((length*length)+(breadth*breadth)) ** 0.5;
	//}

	public static void main(String[] args) {
		double length=5.0;
		double breadth=3.0;
		Rectangle rect=new Rectangle(length,breadth);
		double area=rect.PrintArea();
		double perimeter=rect.PrintPerimeter();
		System.out.println("Area of Rectangle" + area);
		System.out.println("Perimeter of Rectangle"+ perimeter);	

	}

}
