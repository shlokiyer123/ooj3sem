import java.util.Scanner;
abstract class Shape
{
	double dim1,dim2,radius;
	Shape(double a, double b)
	{
		dim1=a;
		dim2=b;
	}
	Shape(double a)
	{
		radius=a;
	}
	abstract void area();
}
class Rectangle extends Shape
{	
	Rectangle(double a, double b) 
	{
		super(a,b);
	}
	void area()
	{
		System.out.println("The area of the rectangle is : "+(dim1*dim2)+"units");
	}
}
class Triangle extends Shape
{	
	Triangle(double a, double b) 
	{
		super(a,b);
	}
	void area()
	{
		System.out.println("The area of the triangle is : "+(dim1*dim2)/2+"units");
	}
}
class Circle extends Shape
{	
	Circle(double a) 
	{
		super(a);
	}
	void area()
	{
		System.out.println("The area of the triangle is : "+(3.14*radius*radius)+"units");
	}
}
class AbstractAreaMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter your USN : ");
		String usn=sc.nextLine();

		System.out.println("NAME : "+name);
		System.out.println("USN : "+usn);
		
		System.out.println("Enter the dimensions of the rectangle : ");
		double length=sc.nextInt();
		double breadth=sc.nextInt();
		System.out.println("Enter the dimensions of the triangle(base and height) : ");
		double base=sc.nextInt();
		double height=sc.nextInt();
		System.out.println("Enter the radius of the circle: ");
		double r=sc.nextInt();
		Rectangle rect=new Rectangle(length,breadth);
		Triangle tri=new Triangle(base,height);
		Circle cir=new Circle(r);
		Shape shaperef;
		shaperef=rect;
		shaperef.area();
		shaperef=tri;
		shaperef.area();
		shaperef=cir;
		shaperef.area();
	}
}