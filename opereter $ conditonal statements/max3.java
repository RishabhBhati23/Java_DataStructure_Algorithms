import java.util.*;

public class max3{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a ->");
      int a=sc.nextInt();
      System.out.println("enter the b ->");
      int b=sc.nextInt();
      System.out.println("enter the c ->");
      int c=sc.nextInt();


      if((a>=b)&&(a>=c))
      {
        System.out.println("the maximum num is ->"+ a);
      }else if(b>=c)
      {
        System.out.println("the maximum num is ->"+ b);
      }
      else{
          System.out.println("the maximum numberv is ->"+c);
      }


    }
}