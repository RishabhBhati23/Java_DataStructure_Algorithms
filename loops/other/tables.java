import java.util.*;

public class tables{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number that you want to print the tables");
      int n=sc.nextInt();

      for(int i=1;i<=10;i++)
      {
        System.out.println(n + "*" + i + "=" + n* i);
      }

    }
}