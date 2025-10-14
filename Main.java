import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n; String name; String author; int price; int numPages;
        System.out.println("Enter no.of books");
        n=sc.nextInt();
        book b[]=new book[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name");
            name=sc.next();
            System.out.println("Enter author");
            author=sc.next();
            System.out.println("Enter price");
            price=sc.nextInt();
            System.out.println("Enter no of Pages");
            numPages=sc.nextInt();
            b[i]=new book(name,author,price,numPages);

        }
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
            
        }
            
}
