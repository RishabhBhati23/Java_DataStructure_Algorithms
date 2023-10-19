import  java.util.*;

public class sum_fun{

    public static int calculate_sum(int num1,int num2)
    {
      int sum=num1+num2;//where num1 & num2 are formsl parameter
      return sum;
    }
    
    
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);

      int a=sc.nextInt();
      int b=sc.nextInt();
      
      int sum=calculate_sum(a,b);//where a &b are arguments/actual parameter

      System.out.println("Sum is---->"+sum);


    }
}