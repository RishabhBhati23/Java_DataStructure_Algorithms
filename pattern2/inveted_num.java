import java.util.*;


public class inveted_num{
    
    public static void number_inverted(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
              System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        number_inverted(n);

    }
}