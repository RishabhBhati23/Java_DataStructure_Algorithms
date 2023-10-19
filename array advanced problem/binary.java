import java.util.*;

public class binary{
    
    public static int binarySearch(int numbers[],int key)
    {
        int start=0;
        int end=numbers.length-1;

        while(start<=end)
        {
          int mid=(start+end)/2;


          if(numbers[mid]==key)
          {
             return mid;
          }
          if(numbers[mid]<key)
          {
             //right wala part
             start=mid+1;
          }
          else
          {
             //left wala part
             end=mid-1;
          }

        }
        return -1;
    }
    public static void main(String args[])
    {
      int number[]={12,5,8,5,2,62,52,2,659};
      int key=0;

      int index=binarySearch(number,key);

      if(index==-1)
      {
        System.out.println("number is a not found");
      }
      else{
        System.out.println("number is a found and there index is a "+index);
      }
    }

}