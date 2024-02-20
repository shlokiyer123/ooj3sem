package cie;
import java.util.Scanner;
public class Internals extends Student 
{
    protected int marks[] = new int[5];
    public void inputCIEmarks()
    {
        Scanner s =new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.printf("Enter the %d st/th subject mark : ",i+1);
            marks[i]=s.nextInt();

        }

    }
}