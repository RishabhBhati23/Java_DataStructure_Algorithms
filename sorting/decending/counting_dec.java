import java.util.*;

public class counting_dec{
    public static void countingSort(int arr[])
    {
        int largest=Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++)
        {
           largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];

        for(int i=0 ; i<arr.length ; i++)
        {
           count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1 ; i>=0 ; i--)
        {
            while(count[i]>0)
             {
                arr[j]=i;
                j++;
                count[i]--;
             }
        }
    }

    public static void printarr(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
           System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        int arr[]={4,5,1,2,3,6};
        countingSort(arr);
        printarr(arr);
    }

}