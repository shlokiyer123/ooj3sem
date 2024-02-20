import java.util.*;
class WrongAge extends Exception
{
    public WrongAge(String s)
    {
        super(s);
    }
}
class Father
{
    private int age;
    public Father(int age) throws WrongAge
    {
        this.age=age;
        if(age<0)
        {
            throw new WrongAge("Age of father cannot be negative ");
        }
    }    
}
class Son extends Father
{
    private int SonAge;
    public Son(int FatherAge,int SonAge) throws WrongAge
    {
        super(FatherAge);
        if(SonAge<0)
        {
            throw new WrongAge("Son's age cannot be negative");
        }
        else if(SonAge>=FatherAge)
        {
            throw new WrongAge("Son cannot be older/equal than father");

        }
        else if(FatherAge-SonAge<=20)
        {
            throw new WrongAge("Difference of age is very less");

        }
        else
        {
            System.out.println("Age is Valid");
        }
        this.SonAge=SonAge;
    }
        
}

class FatherSonAge 
{
    public static void main(String args[])
    {
        try
        {   Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Age of the son ");
            int SonAge=sc.nextInt();
            System.out.println("Enter the father's age: ");
            int FatherAge=sc.nextInt();
            Son son=new Son(FatherAge,SonAge);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}