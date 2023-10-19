import java.util.*;

public class Sorted{
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }
    
    public static void main(String args[])
    {
       /*int arr[]=new int[5];
       Scanner sc=new Scanner(System.in);

       int n=arr.length-1;

       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       */
       int arr[]={1,6,3,4};

       System.out.println("array is a--->"+" "+isSorted(arr,0));


    }
}