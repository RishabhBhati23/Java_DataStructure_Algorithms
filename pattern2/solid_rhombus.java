import java.util.*;

public class solid_rhombus{
    
    public static void solid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //space 
            for(int j=1;j<=n-i;j++)
            {
              System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++)
            {
              System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();


        solid(n);


    }
}