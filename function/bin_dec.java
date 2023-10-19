import java.util.*;

public class bin_dec{
    
    public static void binarytodeci(int binNum)
    {
      int myNum=binNum;
      int pow=0 ;
      int decNum=0;

      while(binNum>0)
      {
        int lastdigit=binNum%10;
        decNum=decNum + (lastdigit * (int)Math.pow(2,pow));
        pow++;
        binNum=binNum/10;
      }

      System.out.println("decimal of\n"+myNum+"=\n"+decNum);
    }
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);                  
      int n=sc.nextInt();

      binarytodeci(n);

    }
}