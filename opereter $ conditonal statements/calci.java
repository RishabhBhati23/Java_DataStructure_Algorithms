import java.util.*;

public class calci{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //inputs
        int a=sc.nextInt();
        int b=sc.nextInt();
        //operetion
        char operation=sc.next().charAt(0);
        switch(operation)
        {
          case '+': System.out.println(a+b);
                    break;
          case '-': System.out.println(a-b);
                    break;
          case '*': System.out.println(a*b);
                    break;
          case '/': System.out.println(a/b);
                    break;
          case '%': System.out.println(a%b);
                    break;
          default : System.out.println("wrong operation");

        }

    }
}