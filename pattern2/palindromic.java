import java.util.*;

public class palindromic{
    
    public static void palindrome(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
              System.out.print(" ");
            }
            //dec
            for(int j=i;j>=1;j--)
            {
              System.out.print(i);
            }
            //asc
            for(int j=2;j<=i;j++)
            {
              System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();
      palindrome(n);

    }
}