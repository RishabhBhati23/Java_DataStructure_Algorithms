import java.util.*;

public class max_subarray{
    public static void get_max(int numbers[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int n=numbers.length-1;
        for(int i=0;i<=n;i++)
        {
            int start=i;
            for(int j=i;j<=n;j++)
            {
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++)
                {
                  //subarray sum
                  currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum)
                {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max-->"+maxSum);
    }    
    public static void main(String args[])
    {
       int numbers[]={1,-2,6,-1,3};
       get_max(numbers);      
    }
}