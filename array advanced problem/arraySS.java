import java.util.*;


public class arraySS{
    
    public static void update(int marks[])
    {
        for(int i=0;i<=marks.length;i++)
        {
           marks[i]=marks[i]+1;
        }
    }

    public static void main(String args[])
    {
      //Scanner sc=new  Scanner(System.in);
       int marks[]={97,98,99,100,101};

       update(marks);

       //print the our marks

       for(int i=0;i<=marks.length;i++)
       {
         System.out.print(marks[i]+" ");
       }

       System.out.println();

    }
}