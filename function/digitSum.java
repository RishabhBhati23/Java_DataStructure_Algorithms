import java.util.*;

public class digitSum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number-->");

        int digit=sc.nextInt();
        System.out.println("sum of digits is a :"+ sum_digit(digit)+" ");

    }

    public static int sum_digit(int number)
    {
        int sumofdigit=0;

        while(number>0)
        {
           int lastdigit=number%10;
           sumofdigit+=lastdigit;
           number/=10;
        }
        return sumofdigit;
    }
}