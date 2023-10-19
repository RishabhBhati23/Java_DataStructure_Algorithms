import java.util.Arrays;
import java.util.Collections;

public class inbuilt{
    
    public static void main(String args[])
    {
      Integer arr[]={4,5,1,3,2,6};
      
      Arrays.sort(arr);
      
      System.out.println("the sorted array is given below--->>");
      
      //print the arrayss
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]+" ");
      }
      System.out.println();

     /* 
      //reverse the array
      
      Arrays.sort(arr,0,5,Collections.reverseOrder());
      
      for(int i=0 ; i<arr.length ; i++)
      {
         System.out.println(arr[i]+" ");
      }
       System.out.println();
       */
    }
}