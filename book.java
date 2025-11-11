/*Create a class Book which contains four members: name, author,
price, num_pages. Include a constructor to set the values for the
members. Include methods to set and get the details of the objects.
Include a toString( ) method that could display the complete details of
the book. Develop a Java program to create n book objects.*/
import java.util.*;
public class book
{
    String name,author;
    int price,num_pages;
    book(String n,String a,int p,int page)
    {
        name=n;
        author=a;
        price=p;
        num_pages=page;
    }
    public String toString()
    {
        String name, author, price, numPages;
        name = "Book name: " + this.name + "\n";
         author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
         numPages = "Number of pages: " + this.num_pages + "\n";

       return name + author + price + numPages;
    }
public class Lp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, price,pages;
        String name,author;
        System.out.println("enter no of books");
        n = sc.nextInt();
        sc.nextLine();
        book b[] = new book[n];
        for(int i = 0 ;i<n;i++){
            System.out.println("enter name");
            name = sc.nextLine();
            System.out.println("enter author");
            author = sc.nextLine();
            System.out.println("enter price");
            price = sc.nextInt();
            System.out.println("enter pages");
            pages = sc.nextInt();
            b[i] = new book(name,author,price,pages);
            sc.nextLine();
        }
        for(int i = 0;i<n;i++)
            System.out.println(b[i]);
    }

}

        
    

    




