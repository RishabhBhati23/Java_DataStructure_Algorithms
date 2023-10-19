import java.util.*;

public class thermo{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      float temp=sc.nextFloat();

      if(temp>100)
      {
        System.out.println("you have a fever....");
      }
      else{
        System.out.println("you dont have a fever.....");
      }
    }

}