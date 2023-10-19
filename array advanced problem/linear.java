import java.util.*;


public class linear{
    public static int linearSearch(int numbers[],int key)
    {
        for(int i=0;i<=numbers.length-1;i++)
        {
           if(numbers[i]==key)
           {
             return i;
           }

          
        }
         return -1;
    }
    
    public static void main(String args[])
    {
      int numbers[]={4,5,68,2,4,6,42,10,15};
      int key=2;

      int index=linearSearch(numbers,key);

      if(index==-1)
      {
        System.out.println("not found a number in this array");
      }
      else
      {
        System.out.println("the number is exist in this a array that have a index -->"+index);
      }
    }
}