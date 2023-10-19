import java.util.*;

public class Subset{
    public static void findSubsets(String str, String ans , int i)
    {
        //base case

        if(i == str.length())
        {
            if(ans.length() == 0)
            {
               System.out.println("");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //yes choise
        findSubsets(str, ans + strcharAt(i),i+1);
        //no choise
        findSubsets(str,ans,i+1);

    }

    public static void main(String args[])
    {
       String str="abc";
       findSubsets(str," ",0);        
    }
}