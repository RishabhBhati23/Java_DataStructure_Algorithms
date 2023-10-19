import java.util.*;
public class fun_fact{
  public static int fact(int num)
  {
      int f=1;

      for(int i=1;i<=num;i++)
      {
        f=f*i;
      }

      return f;
  }



    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();
      

      System.out.println("Factorial is ---->"+ fact(n));
    }
}