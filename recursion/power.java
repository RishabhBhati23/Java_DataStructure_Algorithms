public class power{
    public static int Power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * Power(x, n-1);
    }

    public static void main(String args[])
    {
       int x=2;
       int n=4;

       System.out.println(Power(x,n));
    }
}