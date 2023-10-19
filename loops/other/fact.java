import java.util.Scanner;

public class fact{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int num;//to hold number
        int fact=1;//to hold factorial

        System.out.println("enter the number---->");
        num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }

        System.out.println("factorial is->" + fact);
    }
}