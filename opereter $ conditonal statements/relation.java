import java.util.*;

public class relation{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Relational opereter");
        System.out.println("enter a->");
        int a=sc.nextInt();
        System.out.println("enter b->");
        int b=sc.nextInt();

        System.out.println("a==b ->"+(a==b));
        System.out.println("a!=b ->"+(a!=b));
        System.out.println("a>=b ->" +(a>=b));
        System.out.println("a<=b ->"+(a<=b));
        System.out.println("a>b ->"+(a>b));
        System.out.println("a<b ->"+(a<b));
    }
}