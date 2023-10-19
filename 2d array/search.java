import java.util.*;


public class search{
    public static boolean searchkey(int mat[][] , int key)
    {
       
       for(int i=0 ; i<mat.length ; i++)
       {
        for(int j=0 ; j<mat[0].length ; j++)
        {
           if(mat[i][j]==key)
           {
             System.out.println("found of cell("+i+j+")");
             return true;
           }
        }
        
       }
       System.out.println("key not found");
       return false;
    }

    public static void main(String args[])
    {
      

       int mat[][]=new int[3][3];
       //int key=5;

       int n=mat.length;
       int m=mat[0].length;

        Scanner sc=new Scanner(System.in);
      //input
       for(int i=0;i<n;i++)
       {
         for(int j=0;j<m;j++)
         {
            mat[i][j]=sc.nextInt();
         }
       }

       //output
       for(int i=0;i<n;i++)
       {
         for(int j=0;j<m;j++)
         {
            System.out.print(mat[i][j]+"");
         }
         System.out.println();
       }
       

       searchkey(mat,1);



       

    }
}