package cie;

import java.util.Scanner;

public class Student
{

    protected String usn = new String(); 
    protected String name = new String(); 
    protected int sem;
    

    public void inputStudentDetails() 
    { 
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the name : ");
        name=s.next();
        System.out.println("Enter the usn : ");
        usn=s.next();
        System.out.println("Enter the semester : ");
        sem=s.nextInt();
    }

    public void displayStudentDetails()
    {
        System.out.println("Name : "+name);
        System.out.println("usn : "+usn);
        System.out.println("sem : "+sem);
    }
}