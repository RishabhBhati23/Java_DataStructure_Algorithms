import java.util.*;

public class max{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);

      System.out.println("enter the value of a is->");
      int a=sc.nextInt();
      System.out.println("enter the value ofc b is->");
      int b=sc.nextInt();

      if(a>b)
      {
          System.out.println("a is greater.");
      }else{
          System.out.println("b is greater");
      }
    }

}