import java.util.*;

public class income{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the income ------>>>");
      int income=sc.nextInt();

      if(income<=500000)
      {
        System.out.println("you cam pay tax --> 0 %");
      }else if((income>=500000)&&(income<=1000000))
      {
        System.out.println("you can pay tax --> 20%");
      }
      else{
        System.out.println("you can pay tax --> 30 %");
      }
    }
}