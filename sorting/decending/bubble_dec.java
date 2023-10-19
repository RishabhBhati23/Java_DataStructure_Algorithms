import java.util.*;

public class bubble_dec{
    
    public static void bubble(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i;j++)
            {
               if(arr[j]<arr[j+1])
               {
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
               }
            }
        }
    }

    public static void printarr(int arr[])
    {
       for(int i=0;i<arr.length;i++)
       {
          System.out.println(arr[i] + " ");
       }
       System.out.println();
    }
    
    public static void main(String args[])
    {
        int arr[]={3,6,2,1,8,7,5,3,1};

        bubble(arr);
        printarr(arr);

    }
}