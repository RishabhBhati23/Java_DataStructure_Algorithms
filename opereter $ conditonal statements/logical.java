import java.util.*;

public class logical{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in); 
      System.out.println("Logical opereter");

      System.out.println("enter a:->");
      int a=sc.nextInt();
      System.out.println("enter b:->");
      int b=sc.nextInt();
      System.out.println("enter c:->");
      int c=sc.nextInt();
      System.out.println("enter d:->");
      int d=sc.nextInt();
      //AND
      System.out.println("and opereter:-");
      System.out.println( (a>=b) && (c>=d) );
      //OR
      System.out.println("or opereter:-");
      System.out.println( (a>=b) || (c>=d) );
      //NOT
      System.out.println("not opereter:-");
      System.out.println( !(a>b) );
    }
}