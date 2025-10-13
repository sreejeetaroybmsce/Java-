import java.util.*;
public class student
{    Scanner sc=new Scanner(System.in);
     String sub;
     int credits;
     int grade;
     String name;
     String usn;
     double sgpa;
     void getstudentdetails(String n,String u)
     {
        this.name=n;
        this.usn=u;
     }
     void getmarks()
     {  int arr[]=new int[8];
        int credit[]=new int[8];
        System.out.println("Enter marks for 8 subjects");
        for(int i=0;i<8;i++)
        arr[i]=sc.nextInt();
     System.out.println("Enter credit for each");
        for(int i=0;i<8;i++)
        credit[i]=sc.nextInt();
        int grade[]=new int[8];
         for(int i=0;i<8;i++)
         {
            grade[i]=(arr[i]/10)+1;
            if(grade[i]==11)
            grade[i]=10;
            if(grade[i]<=4)
            grade[i]=0;
         }
         computesgpa(grade,credit);
     }
     void computesgpa(int[] grades,int[] credits)
     {   int score=0;int total=0;
         for(int i=0;i<8;i++)
         {
            score=score+(grades[i]*credits[i]);
            total=total+credits[i];
         }
         double ans=(double)score/(double)total;
         System.out.println("Name is:"+name);
         System.out.println("USN: "+usn);
         System.out.println("sgpa: "+ans);

     }
    
     
     public static void main(String args[])
     {
        
        student s1=new student();
        s1.getstudentdetails("Rahul", "1bf24cs234");
        s1.getmarks();


        

     }
 
}