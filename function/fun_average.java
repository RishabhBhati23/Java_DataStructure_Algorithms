import java.util.*;



public class fun_average{
    
    public static double average(double x,double y,double z)
    {
        return (x+y+z)/3;
    }
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);

      System.out.println("enter your first number->");
      double a=sc.nextDouble();

      System.out.println("enter the second number->");
      double b=sc.nextDouble();

      System.out.println("enter the third number ->");
      double c=sc.nextDouble();


      System.out.println("the average of three number--->"+ average(a,b,c)+"\n");


    }
}