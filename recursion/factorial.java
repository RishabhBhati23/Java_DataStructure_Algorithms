import java.util.*;

public class factorial{
    public static int fact(int n) {
       //base case
        if(n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }

    public static void main(String args[])
    { 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();

      System.out.println("factorial is--->"+" "+fact(n));  
    }
}