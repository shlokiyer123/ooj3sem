import java.util.Scanner;
class Subject
{
	int subjectMarks; 
	int credits;
	int grade;
}
class Student
{
	String name;
	String usn;
	Subject subject[];
	double sgpa;
	Scanner s;
	
	Student()
	{	
		int i;
		subject=new Subject[9];
		for(i=0;i<9;i++)
			subject[i] = new Subject();
		s = new Scanner(System.in);
	}
	void getStudentDetails()
	{
		System.out.println("Enter the USN :");
		usn=s.nextLine();
		System.out.println("Enter the name :");
		name=s.nextLine();
	}
	void getmarks()
	{
		for(int i=0;i<9;i++)
		{
			System.out.println("Enter the subjectmarks :");
			subject[i].subjectMarks=s.nextInt();
			System.out.println("Enter the credts:");
			subject[i].credits=s.nextInt();
			subject[i].grade=(subject[i].subjectMarks/10)+1;
			if(subject[i].grade>10)
				subject[i].grade=10;
			if(subject[i].grade<=4)
				subject[i].grade=0;
		}
	}
	void computeSGPA()
	{
		int effectivescore=0;
		int totalcred=0;
		for( int i=0;i<9;i++)
		{	
			effectivescore+=(subject[i].grade*subject[i].credits);
			totalcred+=subject[i].credits;
		}
		sgpa=(double)effectivescore/(double)totalcred;
	}
}
public class Main
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.getStudentDetails();
		s1.getmarks();
		s1.computeSGPA();
		System.out.println("Name : "+s1.name);
		System.out.println("usn : "+s1.usn);
		System.out.println("SGPA : "+s1.sgpa);
	}
}		
			

		
