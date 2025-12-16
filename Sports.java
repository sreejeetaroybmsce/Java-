package Extracurricular;
import Academics.Student;

public class Sports extends Student
{
    int matches;
    String s;
    int n;
     public Sports(int no,String s,int r)
    {
        
           
         super(s,r);
        this.matches=no;
        this.s=s;
         n=r;
    }

    public void display_details()
    {
        System.out.println("Displaying details of the Students");
        System.out.println("Name of Student is:"+s);
        System.out.println("Roll number of student is:"+n);
        System.out.println("No.of matches played is:"+matches);
    }
}

