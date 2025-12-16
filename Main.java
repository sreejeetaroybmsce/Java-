import Extracurricular.*;
import java.util.*;
public class Main 
{
    static void m(int x,int y)
    {
        System.out.println(x+y);
    }
    static void m(int x)
    {
        System.out.println(x*x);
    }
    static void m()
    {
        System.out.println("Nothing in input");
    }
    static void m(String p)
    {
        System.out.println(p);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String n;
        int r,m;
        System.out.println("Enter name of Student");
        n=sc.nextLine();
        System.out.println("Enter roll number of Student");
        r=sc.nextInt();
        System.out.println("Enter no.of matches played");
        m=sc.nextInt();
        Sports sp=new Sports(m,n,r);
        sp.display_details();
        m(9,2);
        m(2);
        m();
        m("hello");
        
    }
    
}
