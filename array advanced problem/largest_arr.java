import java.util.*;

public class largest_arr{
    
    public static int getlargest(int numbers[])
    {
      int largest=Integer.MIN_VALUE;//- INFINITY

      for(int i=0;i<=numbers.length-1;i++)
      {
        if(largest<numbers[i])
        {
            largest=numbers[i];
        }
      }
      return largest;
    }

    public static void main(String args[])
    {
      int numbers[]={45,4,6,78,1,21,32,65,65,45,43,37};
      int highest=getlargest(numbers);

      System.out.println("the largest number in the array is--->>>"+ highest);

    }
}