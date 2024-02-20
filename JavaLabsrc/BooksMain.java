import java.util.Scanner;
class Books
{
	String name; 
	String author;
	int price;
	int numPages;
	Books(String name, String author, int price, int numPages)
	{

		this.name = name;
		this.author = author;
		this.price = price;
		this.numPages = numPages;
	}
	public String toString()

	{

		String name, author, price, numPages;

		name = "Book name: " + this.name + "\n";

		author = "Author name: " + this.author + "\n";

		price = "Price: " + this.price + "\n";

		numPages = "Number of pages: " + this.numPages + "\n";

		return name + author + price + numPages;

	}
}
class BooksMain
{
	public static void main(String args[])

	{

		Scanner s = new Scanner(System.in);

		int n;
		String name;
		String author;
		int price; 
		int numPages;
		String ans;
		System.out.println("Enter the amount of books");
		n = s.nextInt();
		Books b[];
		b = new Books[n];
		for(int i=0;i<n;i++)
		{	
			
			System.out.println("Enter the name of the book");
			name=s.next();
			System.out.println("Enter the author of the book");
			author=s.next();
			System.out.println("Enter the price of the book");
			price=s.nextInt();
			System.out.println("Enter the amount of pages of the book");
			numPages=s.nextInt();
			b[i] = new Books(name,author,price,numPages);
		}
		for(int i=0;i<n;i++)
		{	
			ans=b[i].toString();
			System.out.println(ans);
		}
	}
}

