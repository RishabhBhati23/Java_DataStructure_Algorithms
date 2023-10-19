import java.util.*;
// continue---> skip the iteration of the loop
public class continueloop{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
            if(i==3)
            {
              continue;
            }
            System.out.println(i);
        }
    }
}