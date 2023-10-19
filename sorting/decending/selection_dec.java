import java.util.*;

public class selection_dec{
   
    public static void selctionSort(int arr[])
    {
        for(int turn=0 ; turn<arr.length ; turn++)
        {
            int minPos=turn;
            for(int j=turn+1; j<arr.length ; j++)
            {
               if(arr[minPos]<arr[j])
               {
                 minPos=j;
               }
            }

            //swap 

            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void printarr(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
           System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
       int arr[]={5,4,1,2,3,6};

       selctionSort(arr);
       printarr(arr);
    } 
}