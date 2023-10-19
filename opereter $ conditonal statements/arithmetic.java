import java.util.*;

public class arithmetic{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in); 
      System.out.println("Arithmetic opereter");
      
      System.out.println("1.Binary opereter");
      System.out.println("2.Unary opereter");
      
      System.out.println("1. Binary opereter");
      System.out.println("enter a:->");
      int a=sc.nextInt();
      System.out.println("enter b:->");
      int b=sc.nextInt();

      System.out.println("a+b->"+(a+b));
      System.out.println("a-b->"+(a-b));
      System.out.println("a*b->"+(a*b));
      System.out.println("a/b->"+(a/b));
      System.out.println("a%b->"+(a%b));

      System.out.println("Unary opereter");
      System.out.println("enter c:->");
      int c=sc.nextInt();

      System.out.println("Post increment & pre increment");
      System.out.println("post increment-"+ (c++));
      System.out.println("pre increment-"+ (++c));
      System.out.println("post decrement"+ (c--));
      System.out.println("pre decrement"+ (--c));
    }
}