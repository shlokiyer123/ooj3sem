import java.util.Scanner;
class quadratic
{
	int a,b,c;
	double r1,r2,d;
	void getd()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the coefficient of a,b,c");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
	}
	void compute()
	{
		while(a==0)
		{
			System.out.println("Not a quadratic equation");
			System.out.println("Enter a non zero number");
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
		}
		d=(b*b)-(4*a*c);
		if(d==0)
		{
			r1=(-b)/(2*a);
			System.out.println("The roots are equal");
			System.out.println("Root1=Root2="+r1);
		}
		else if(d>0)
		{
			r1=((-b)+(Math.sqrt(d))/(double)(2*a));
			r2=((-b)-(Math.sqrt(d))/(double)(2*a));
			System.out.println("The roots are real and distinct");
			System.out.println("Root1= "+r1+"Root 2"+r2);
		}
		else if(d<0)
		{
			System.out.println("The roots are imaginary");
			r1=(-b)/(2*a);
			r2=Math.sqrt(-d)/(2*a);
			System.out.println("Root1= "+r1+"+i"+r2);
			System.out.println("Root1= "+r1+"-i"+r2);
		}
	}
}
class QuadraticMain
{
	public static void main(String args[])
	{
		quadratic q=new quadratic();
		q.getd();
		q.compute();
	}
}
