import java.util.*;


public class binomial{
    public static int factorial(int num){
        int f=1;

        for(int i=1;i<=num;i++)
        {
            f=f*i;
        }

        return f;
    }

    public static int bi_coff(int n,int r)
    {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int binCoff = fact_n/(fact_r*fact_nmr);

        return binCoff;
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        System.out.println("bin. cofficient---->"+bi_coff(n,r));
    }
}