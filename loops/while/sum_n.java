import java.util.*;

public class sum_n{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        int i=1;
        while(i<=n)
        {
          sum=sum+i;
          i++;
        }
        System.out.println("the sum of the first"+n+"is -->"+sum);
    }
}

