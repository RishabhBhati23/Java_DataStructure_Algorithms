import java.util.*;
public class pairing{
    public static int friendsPairing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();

       System.out.println(friendsPairing(n));
    }
}