public class optimized{
     public static int optimizedPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        
        if(n % 2 == 0) { //even
            return optimizedPower(x, n/2) * optimizedPower(x, n/2);
        } else { //odd
            return x * optimizedPower(x, n/2) * optimizedPower(x, n/2);
        }
    }

    public static void main(String args[])
    {
        int x=7;
        int n=4;

        System.out.println(optimizedPower(x,n));
    }
}