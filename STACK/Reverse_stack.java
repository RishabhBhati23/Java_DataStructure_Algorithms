import java.util.*;

public class Reverse_stack{
    public static void PushAtBottem(Stack<Integer> s,int data)
    {
       if(s.isEmpty())
       {
          s.push(data);
          return;
       }
       int top=s.pop();

       PushAtBottem(s,data);
       s.push(top);
    }

    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverse(s);
        PushAtBottem(s,top);

    }
    public static void printstack(Stack<Integer> s)
    {
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }

    }

    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        //3,2,1
        reverse(s);
        //1,2,3
        printstack(s);
    }
}