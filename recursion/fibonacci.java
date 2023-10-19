import java.util.*;

public class fibonacci{
    public static int fib(int n) {
        
        //base case
        if(n == 0 || n == 1) {
            return n;
        }
        
        int fnm1 = fib(n-1); 
        int fnm2 = fib(n-2); 
        int fn = fnm1 + fnm2;
        return fn;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("series is a->>>"+" "+fib(n));

    }
}