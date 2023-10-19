import java.util.*;

public class pair_array{
    public static void pair(int numbers[])
    {
        int n=numbers.length-1;
        int tp=0;
        for(int i=0;i<=n;i++)
        {
            int curr=numbers[i];//2 4 6 8  10 
            for(int j=i+1;j<=n;j++)
            {
               System.out.print("("+curr+","+numbers[j]+")");
               tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    
    public static void main(String args[])
    {
      int numbers[]={2,4,6,8,10};
      pair(numbers);
    }
}