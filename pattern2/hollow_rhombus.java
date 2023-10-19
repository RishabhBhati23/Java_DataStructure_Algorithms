import java.util.*;

public class hollow_rhombus{
    public static void hollow(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
              System.out.print(" ");
            }

            //stars

            for(int j=1;j<=n;j++)
            {
              if(i==1||i==n||j==1||j==n)//boundary rectangle
              {
                System.out.print("*");
              }
              else{
                System.out.print(" ");
              }
            }

            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);


      int n=sc.nextInt();

      hollow(n);

    }
}