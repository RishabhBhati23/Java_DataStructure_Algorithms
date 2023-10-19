import java.util.*;

public class bubble{
    public static void bubbleSort(int arr[])
    {
       for(int turn=0 ; turn<=arr.length-1 ; turn++)
       {
        for(int j=0 ; j<arr.length-1 ; j++)
        {
           //swap
           if(arr[j]>arr[j+1])
           {
             //SWAP
             int temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
           }
        }
       }
    }

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
        int arr[]={5,4,1,2,3};
        bubbleSort(arr);
        System.out.println("after the sorting print the array.....");
        printarr(arr);
        
        
    }
}