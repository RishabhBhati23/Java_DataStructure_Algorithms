import java.util.*;

public class hollow{
    
    public static void hollow_rectangle(int n,int m)
    {
      for(int i=1;i<=n;i++)//n----->>> totel no of rows
      {
        for(int j=1;j<=m;j++)//m---> totel no of column
        {
           if(i==1||i==n||j==1||j==m)
           {
              System.out.print("*");
           }
           else
           {
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
        int m=sc.nextInt();
        hollow_rectangle(n,m);

    }
}