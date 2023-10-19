import java.util.*;

public class DSA1{
    public static boolean Duplicate_value(int nums[])
    {
      for(int i=0; i<nums.length-1 ; i++)
      {
        for(int j=i+1 ; j<nums.length ; j++)
        {
           if(nums[i] == nums[j])
           {
             return true;
           }
        }
      }

      return false;
    }
    
    public static void main(String args[])
    {
        /*Scanner sc=new Scanner(System.in);
        int nums[]=new int[50];

        int n=sc.nextInt();
        System.out.println("enter the array numbers->>");

        for(int i=0;i<n;i++)
        {
          nums[i]=sc.nextInt();
        }
        */
        int nums[]={1,2,1,4};


        System.out.println("twise present in array--->"+Duplicate_value(nums));
    }
}