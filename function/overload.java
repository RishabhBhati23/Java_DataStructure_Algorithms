import java.util.*;


public class overload{
   
    //function 1
     public static int sum(int a,int b,int c)
     {
        int sum=a+b+c;
        return sum;
     }


    //function 2
    public static int sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
   
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //function overload using parameter

        System.out.println("The Sum is---->"+sum(a,b));



    }
}