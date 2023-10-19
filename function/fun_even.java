import java.util.*;

public class fun_even{

    public static boolean isEven(int number)
    {
      if(number%2==0)
      {
        return true;
      }else{
        return false;
      }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int num;
        System.out.println("enter the number-->");
        num=sc.nextInt();

        if(isEven(num))
        {
           System.out.println("number is even.");
        }else{
           System.out.println("number is odd.");
        }
    }
}

