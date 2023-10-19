import java.util.*;


public class creation{
    public static void main(String args[])
    {
       int marks[]=new int[100];
       Scanner sc=new Scanner(System.in);

       //creation of arrays

       //int marks[]=new  int [50];
        //int number[]={1,2,3,4,5};
       //input
       marks[0]=sc.nextInt();//phy
       marks[1]=sc.nextInt();//chem.
       marks[2]=sc.nextInt();//maths


       //output

       System.out.println("phy--->"+marks[0]);
       System.out.println("chem-->"+marks[1]);
       System.out.println("math-->"+marks[2]);


       //update 
       marks[2]=100;
       System.out.println("math-->"+marks[2]);


        

    }
}