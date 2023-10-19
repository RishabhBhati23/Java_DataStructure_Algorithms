import java.util.*;

public class subarray{

    public static void subarray(int numbers[])
    {
        int n=numbers.length-1;

        int ts=0;

        for(int i=0;i<=n;i++)
        {
            int start=i;
            for(int j=i+1;j<=n;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                  System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }
    public static void main(String args[])
    {
       int numbers[]={1,3,5,7,9};
       subarray(numbers);
    }
}