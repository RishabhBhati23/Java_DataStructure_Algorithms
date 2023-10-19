import java.util.*;

public class Sum{
    public static int calcSum(int n) {
        if(n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Sum of n number is a--->"+" "+calcSum(n));
    }
}