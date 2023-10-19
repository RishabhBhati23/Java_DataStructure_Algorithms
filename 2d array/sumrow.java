import java.util.*;

public class sumrow{
    public static void main(String args[])
    {
        int [][] nums={{1,5,6},{11,4,3},{7,5,6}};

        int sum=0;

        //sum of the second row number

        for(int j=0;j<nums[0].length;j++)
        {
           sum+=nums[1][j];
        }


        System.out.println("the sum of second row is--->"+sum);
    }

}