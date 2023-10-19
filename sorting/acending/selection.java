import java.util.*;

public class selection{
    //selection sort code
    public static void selectionSort(int arr[])
    {
      for(int i=0;i<arr.length-1;i++)
      {
        int minPos=i;

        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[minPos]>arr[j])
            {
               minPos=j;
            }
        }
        //swap
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;

      }
    }
   //the print function that can be printed the value.....
    public static void printarr(int arr[])
    {
       for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]+" ");
       }
       System.out.println();
    }


    public static void main(String args[])
    {
      int arr[]={5,4,1,3,2};
      selectionSort(arr);
      printarr(arr);
    }
}