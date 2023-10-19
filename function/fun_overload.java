import java.util.*;


public class fun_overload{
    
    //function 1---> datatypes-->float
    public static float sum(float a,float b)
    {
        float sum=a+b;
        return sum;
    }

    //function 2---> datatypes-->int
    public static int sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }      
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //overloading function through datatypes......
        int a=30;
        int  b=20;
        

        System.out.println("Sum is===>"+sum(a,b));

    }
}